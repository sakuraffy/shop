package cn.sakuraffy.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.sakuraffy.shop.model.Category;
import cn.sakuraffy.shop.service.CategoryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:beans.xml")
public class CategoryServiceTest {
	
	@Resource
	private CategoryService categoryService;
	
	@Test
	public void testQueryJoinAccount() {
		for (Category c : categoryService.queryJoinAccount("",1,2)) {
			System.out.println(c);
			System.out.println(c.getAccount());
		}
	}
}
