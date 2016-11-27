package cn.sakuraffy.shop.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.sakuraffy.shop.model.User;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends BaseAction<User>{

	private static final long serialVersionUID = 6673774928941857448L;
	
	public String login() {
		model = userService.login(model);
		if(model == null) {
			session.put("error", "账号或密码错误");
			return "login";
		} else {
			session.put("user", model);
			if (session.get("goUrl") == null) {
				return "index";
			} else {
				return "goUrl";
			}
		}
	}
}
