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
		pageMap = new HashMap<>();
		Long total = categoryService.total(model.getType());
		List<Category> categorys = categoryService.queryJoinAccount(model.getType(),page, rows);
		pageMap.put("rows", categorys);
		pageMap.put("total", total);
		return "jsonMap";
	}
	
	public String deleteByIds() {
		try {
			categoryService.deleteByIds(ids);
		} catch(Exception e) {
			inputStream = new ByteArrayInputStream("false".getBytes());
			return "stream";
		}
		inputStream = new ByteArrayInputStream("true".getBytes());
		return "stream";
	}
	
}
