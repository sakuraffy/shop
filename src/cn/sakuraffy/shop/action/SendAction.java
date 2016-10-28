package cn.sakuraffy.shop.action;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller("sendAction")
public class SendAction extends ActionSupport{
	
	private static final long serialVersionUID = 6250054133711895042L;

	public String execute() {
		return "send";
	}
}
