package cn.sakuraffy.shop.service;

import java.util.List;

import cn.sakuraffy.shop.model.Account;
import cn.sakuraffy.shop.util.datasource.DataSource;
import cn.sakuraffy.shop.util.datasource.DataSourceType;

public interface AccountService extends BaseService<Account>{
	@DataSource(DataSourceType.MYSQL)
	public Account getById(int id);
	
	@DataSource(DataSourceType.ORACLE)
	public List<Account> query();
}
