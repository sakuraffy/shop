package cn.sakuraffy.shop.service;

import java.util.List;

import cn.sakuraffy.shop.model.Category;

public interface CategoryService {
	public List<Category> queryJoinAccount(String type);
	public List<Category> queryJoinAccount(String type,int page,int size);
}
