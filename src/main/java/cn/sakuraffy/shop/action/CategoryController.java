package cn.sakuraffy.shop.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sakuraffy.shop.model.Category;
import cn.sakuraffy.shop.service.CategoryService;

@Controller("categoryController")
@RequestMapping("/category")
public class CategoryController {
	
	@Resource
	private CategoryService categoryService;
	
	@RequestMapping("/save")
	public void save(Category category) {
		categoryService.save(category);
	}
	
	@RequestMapping("/update")
	public void update(Category category) {
		categoryService.update(category);
	}
	
	@ResponseBody
	@RequestMapping("/queryJoinAccount")
	public Map<String,Object> queryJoinAccount(String type, int page, int rows) {
		Long total = categoryService.total(type);
		System.out.println(total);
		List<Category> list = categoryService.queryJoinAccount(type, page, rows);
		System.out.println(list.size());
		Map<String,Object> map = new HashMap<>();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}
	
	@ResponseBody
	@SuppressWarnings("finally")
	@RequestMapping("/deleteByIds")
	public Boolean deleteByIds(String ids) {
		boolean flag = false;
		try {	
			categoryService.deleteByIds(ids);
			flag = true;
		}catch (Exception e) {
			throw new RuntimeException();
		}finally {
			return flag;
		}
	}
	
	@ResponseBody
	@RequestMapping("/query")
	public List<Category> query() {
		List<Category> list = categoryService.query();
		return list;
	}
}
