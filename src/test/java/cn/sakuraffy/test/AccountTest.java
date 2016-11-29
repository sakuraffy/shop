package cn.sakuraffy.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.sakuraffy.shop.model.Account;
import cn.sakuraffy.shop.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-core.xml")
public class AccountTest {
	@Resource
	private AccountService accountService;
	
	@Test
	public void testGetById() {
		System.out.println(accountService.getById(1));
	}
	
	@Test
	public void testQuery() {
		List<Account> list = accountService.query();
		System.out.println(list.size());
		for(Account account : list) {
			System.out.println(account);
		}
	}
}
