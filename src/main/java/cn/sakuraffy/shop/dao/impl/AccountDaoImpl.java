package cn.sakuraffy.shop.dao.impl;

import org.springframework.stereotype.Service;

import cn.sakuraffy.shop.dao.AccountDao;
import cn.sakuraffy.shop.model.Account;

@Service("accountDao")
public class AccountDaoImpl extends BaseDaoImpl<Account> 
				implements AccountDao {

}
