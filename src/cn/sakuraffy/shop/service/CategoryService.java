package cn.sakuraffy.shop.service;

import java.util.List;

import cn.sakuraffy.shop.model.Category;

public interface CategoryService {
	public Long total();
	public List<Category> queryJoinAccount();
	public List<Category> queryJoinAccount(int page,int rows);
}
