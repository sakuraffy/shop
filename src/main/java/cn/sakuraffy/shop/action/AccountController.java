package cn.sakuraffy.shop.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sakuraffy.shop.model.Account;
import cn.sakuraffy.shop.service.AccountService;

@Controller("accountController")
@RequestMapping("/account")
public class AccountController {
	@Resource
	private AccountService accountService;
	
	@ResponseBody
	@RequestMapping("/query")
	public List<Account> query() {
		List<Account> list = accountService.query();
		return list;
	}
}
