package cn.sakuraffy.shop.mapper;

import java.util.List;
import java.util.Map;

import cn.sakuraffy.shop.model.Category;

public interface CategoryMapper {
	public Long total(String type);
	public List<Category> query();
	public List<Category> queryByHot(boolean hot);
	public List<Category> queryJoinAccountAll();
	public List<Category> queryJoinAccount(Map<String,Object> map);
}
