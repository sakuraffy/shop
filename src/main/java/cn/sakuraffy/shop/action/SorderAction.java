package cn.sakuraffy.shop.action;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.sakuraffy.shop.model.Product;
import cn.sakuraffy.shop.model.Sorder;

@Controller("sorderAction")
@Scope("prototype")
public class SorderAction extends BaseAction<Sorder>{

	private static final long serialVersionUID = 7595547059891849732L;

	public String queryUnfinish() {
		// 获得所有oid为null(即未完成的订单项)
		List<Sorder> sorders = sorderService.queryUnfinish();
		session.put("sorders", sorders);
		// 获得未完成订单项的总金额
		Double total = sorderService.culTotal(sorders);
		session.put("total", total);
		return "showCar";
	}
	
	public String saveToCar() {
		Sorder sorder = sorderService.getById(model.getProduct().getId());
		// 判断是否有同Id的订单项
		if (sorder == null) {
			Product product = productService.getById(model.getProduct().getId());
			model = sorderService.productToSorder(product, 1);
			// 保存订单项
			sorderService.save(model);
		} else {
			//有重复，在其基础上加1
			sorder.setNumber(sorder.getNumber() + 1);
			sorderService.update(sorder);
		}	
		return "index";
	}
	
	// 使用Ajax调用
	public String updateByNumber() {
		// 修改指定订单项的件数
		Sorder sorder = sorderService.getById(model.getId());
		sorder.setNumber(model.getNumber());
		sorderService.update(sorder);
		
		// 重新获取所有未完成订单项及金额
		List<Sorder> sorders = sorderService.queryUnfinish();
		Double total = sorderService.culTotal(sorders);
		session.put("sorders", sorders);
		session.put("total", total);
		// 以流的形式返回总金额
		jsonStream = new ByteArrayInputStream(total.toString().getBytes());
		return "stream";
	}
	
	public String delete() {
		sorderService.delete(model.getId());
		return queryUnfinish();
	}
}
