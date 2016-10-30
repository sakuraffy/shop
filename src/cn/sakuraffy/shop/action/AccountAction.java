package cn.sakuraffy.shop.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.sakuraffy.shop.model.Account;

@Controller(value="accountAction")
@Scope("prototype")
public class AccountAction extends BaseAction<Account>{
	
	private static final long serialVersionUID = 538792132661923032L;

	public String query() {
		jsonList = accountService.query();
		return "jsonList";
	}
}
