package cn.sakuraffy.shop.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.sakuraffy.shop.model.Product;

@Controller("productAction")
@Scope("prototype")
public class ProductAction extends BaseAction<Product>{

	private static final long serialVersionUID = -5212792473096920540L;
	
	public String get() {
		request.put("product", productService.getById(model.getId()));
		return "detail";
	}
}
