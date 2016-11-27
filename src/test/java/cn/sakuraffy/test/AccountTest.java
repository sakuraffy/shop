package cn.sakuraffy.test;

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
	public void testSave() {
		accountService.save(new Account("admin", "管理员", "admin"));
	}
}
