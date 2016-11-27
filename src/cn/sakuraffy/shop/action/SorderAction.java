package cn.sakuraffy.shop.action;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.sakuraffy.shop.model.Product;
import cn.sakuraffy.shop.model.Sorder;

import com.opensymphony.xwork2.ActionContext;

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
	
	public String querySale() {
		List<Object> jsonList = sorderService.querySale(model.getNumber());
		//但这里jsonList是个List<Object>对象，不是BaseAction中的List<T>对象，所以不能使用BaseAction中的List<T>对象来接收
		//所以要在这个Action中新建一个List<Object>并实现set方法，但是有点麻烦
		//这里介绍个更加简便的方法，之前都是先把返回的jsonList经过strus.xml文件配置给root，然后才能将jsonList转成json格式
		//其实我们不用在struts.xml中配root，struts2如果找不到root，就会从值栈的栈顶拿出来数据来转json
		//所以我们只要将现在拿到的jsonList扔到值栈的栈顶，然后在配置文件中写好result就可以了
		ActionContext.getContext().getValueStack().push(jsonList);
		return "jsonList";
	}
}
