package cn.sakuraffy.shop.action;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.sakuraffy.shop.model.Category;

@Controller("categoryAction")
@Scope("prototype")
public class CategoryAction extends BaseAction<Category> {

	private static final long serialVersionUID = -5180663860794640308L;

	public String queryJoinAccount() {
		jsonMap = new HashMap<>();
		Long total = categoryService.total(model.getType());
		List<Category> categorys = categoryService.queryJoinAccount(model.getType(),page, rows);
		jsonMap.put("rows", categorys);
		jsonMap.put("total", total);
		return "jsonMap";
	}
	
	public String deleteByIds() {
		try {
			categoryService.deleteByIds(ids);
		} catch(Exception e) {
			jsonStream = new ByteArrayInputStream("false".getBytes());
			return "jsonStream";
		}
		jsonStream = new ByteArrayInputStream("true".getBytes());
		return "jsonStream";
	}
	
	public void save() {
		categoryService.save(model);
	}
	
	public void update() {
		categoryService.update(model);
	}
	
	public String query() {
		jsonList = categoryService.query();
		return "jsonList";
	}
	
}
