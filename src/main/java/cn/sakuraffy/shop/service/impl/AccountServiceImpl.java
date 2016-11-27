package cn.sakuraffy.shop.service.impl;

import org.springframework.stereotype.Service;

import cn.sakuraffy.shop.model.Account;
import cn.sakuraffy.shop.service.AccountService;

@Service(value="accountService")
public class AccountServiceImpl extends BaseServiceImpl<Account> 
				implements AccountService {

}
