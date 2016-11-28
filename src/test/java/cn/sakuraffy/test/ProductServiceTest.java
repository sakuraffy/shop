package cn.sakuraffy.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.sakuraffy.shop.model.Product;
import cn.sakuraffy.shop.service.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-core.xml")
public class ProductServiceTest {
	
	@Resource
	private ProductService productService;
	
	@Test
	public void testTotal() {
		System.out.println(productService.total(""));
	}
	
	
	@Test
	public void testQueryByCategoryId() {
		for(Product p : productService.queryByCategoryId(1)) {
			System.out.println(p);
		}
	}
	
	@Test
	public void testQueryJoinCategory() {
		for(Product p : productService.queryJoinCategory("", 1, 3)) {
			System.out.println(p);
			System.out.println(p.getCategory());
		}
	}
}
