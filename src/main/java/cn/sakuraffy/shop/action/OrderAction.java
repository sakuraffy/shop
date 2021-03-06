package cn.sakuraffy.shop.action;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.sakuraffy.shop.model.Order;
import cn.sakuraffy.shop.model.Sorder;
import cn.sakuraffy.shop.model.Status;
import cn.sakuraffy.shop.model.User;
import cn.sakuraffy.shop.util.EmailUtil;
import cn.sakuraffy.shop.util.MessageUtil;

@Controller("orderAction")
@Scope("prototype")
@SuppressWarnings("unchecked")
public class OrderAction extends BaseAction<Order>{

	private static final long serialVersionUID = 2891217168749001987L;
	
	@Resource
	private MessageUtil messageUtil;
	@Resource
	private EmailUtil emailUtil;
	
	public String save() {
		List<Sorder> sorders = (List<Sorder>) session.get("sorders");
		model.setSorders(sorders);
		model.setUser((User) session.get("user"));
		model.setTotal((double) session.get("total"));
		model.setDate(new Date());
		model.setStatus(new Status(1));
		// 级联设置Sorder的Order  -- 也可以在加入的时候关联
		for(Sorder sorder : sorders) {
			sorder.setOrder(model);
		}
		orderService.save(model);
		
		// 通过邮件和短信的方式通知
		emailUtil.sendEmail(model.getUser(), model);
		//messageUtil.sendMessage(model.getUser(), model);
		
		return "index";
	}
	
}
