package cn.sakuraffy.shop.action;

import javax.annotation.Resource;

import cn.sakuraffy.shop.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private UserService userService;
	
	public final void setUserService(UserService userService) {
		this.userService = userService;
	}


	public String save() {
		System.out.println("---save---");
		return "index";
	}
	
	public String update() {
		System.out.println("---update---");
		System.out.println(userService);
		return "index";
	}
}
