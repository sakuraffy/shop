package cn.sakuraffy.test;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.sakuraffy.shop.model.User;
import cn.sakuraffy.shop.service.UserService;
import cn.sakuraffy.shop.service.impl.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:beans.xml")
public class S2SHTest {
	@Resource
	private Date date;
	@Resource
	private UserService userService;
	
	@Test
	public void testSpring() {
		System.out.println(date);
	}
	
	@Test
	public void testHibernate() {
		UserService userService = new UserServiceImpl();
		userService.save(new User("sakuraffy",new Date()));
	}
	
	@Test
	public void testSpringHibernate() {
		userService.save(new User("sakuraffy",new Date()));
	}
}
