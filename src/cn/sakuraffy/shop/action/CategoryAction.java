package cn.sakuraffy.shop.action;

import java.util.HashMap;
import java.util.List;

import net.sf.json.JSONSerializer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.sakuraffy.shop.model.Category;

@Controller("categoryAction")
@Scope("prototype")
public class CategoryAction extends BaseAction<Category> {

	private static final long serialVersionUID = -5180663860794640308L;

	public String queryJoinAccount() {
		pageMap = new HashMap<>();
		Long total = categoryService.total();
		List<Category> categorys = categoryService.queryJoinAccount(page, rows);
		pageMap.put("rows", categorys);
		pageMap.put("total", total);
		System.out.println(JSONSerializer.toJSON(pageMap));
		return "jsonMap";
	}
}
