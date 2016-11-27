package cn.sakuraffy.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.sakuraffy.shop.model.Sorder;
import cn.sakuraffy.shop.service.SorderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-core.xml")
public class SorderServiceTest {
	
	@Resource
	private SorderService sorderService;
	
	@Test
	public void save() {
		sorderService.save(new Sorder(null, null, "ss", 123, 2));
	}
	
	@Test
	public void testQueryUnfinish() {
		for (Sorder s : sorderService.queryUnfinish()) {
			System.out.println(s);
		}
	}
	
	@Test
	public void testUpdateByNumber() {
		sorderService.updateByNumber(2, 27);
	}
}
