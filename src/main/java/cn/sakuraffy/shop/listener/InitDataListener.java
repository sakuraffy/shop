package cn.sakuraffy.shop.listener;

import java.util.Timer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.sakuraffy.shop.util.imp.ProdutTimerTask;

public class InitDataListener implements ServletContextListener {
	
	private ProdutTimerTask productTimerTask;
	
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		//把Spring配置文件通过Spring的监听器加载，存储到ServletContext中，我们只要在ServletContext中获取即可
		//ApplicationContext context = (ApplicationContext) event.getServletContext()  
        //       .getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);  
		//categoryService = (CategoryService) context.getBean("categoryService");
		
		//通过工具类获取
		WebApplicationContext context = WebApplicationContextUtils
				.getWebApplicationContext(event.getServletContext());
		
		//从配置文件中获取ProductTimerTask对象
		productTimerTask = (ProdutTimerTask) context.getBean("productTimerTask");
		
		//把内置对象交给productTimerTask,因为productTimerTask里面是拿不到application的，只能通过监听器set给它
		productTimerTask.setApplication(event.getServletContext());
		
		//通过设置定时器，让首页的数据每个一小时同步一次（配置为守护线程）--每30分钟执行一次
		new Timer(true).schedule(productTimerTask, 0, 30*60*1000);
	}
} 