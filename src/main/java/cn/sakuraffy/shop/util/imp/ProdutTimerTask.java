package cn.sakuraffy.shop.util.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.springframework.stereotype.Component;

import cn.sakuraffy.shop.model.Category;
import cn.sakuraffy.shop.model.Product;
import cn.sakuraffy.shop.service.CategoryService;
import cn.sakuraffy.shop.service.ProductService;

@Component("productTimerTask")
public class ProdutTimerTask extends TimerTask {

	@Resource
	private CategoryService categoryService;
	@Resource
	private ProductService productService;
	
	private ServletContext application;
	
	public final void setApplication(ServletContext application) {
		this.application = application;
	}

	@Override
	public void run() {
		List<List<Product>> bigList  = new ArrayList<>();
		// 1. 查询出热点类别
		for(Category category : categoryService.queryByHot(true)) {
			// 2. 根据热点类别id获取推荐商品信息
			List<Product> products = productService.queryByCategoryId(category.getId());
			bigList.add(products);
		}
		 // 3. 把查询的bigList交给application内置对象 
		application.setAttribute("bigList", bigList);
	}

}
