package cn.sakuraffy.shop.service;

import java.util.List;

import cn.sakuraffy.shop.model.Category;

public interface CategoryService extends BaseService<Category>{
	public Long total();
	public Long total(String type);
	public List<Category> queryByHot(boolean hot);
	public List<Category> queryJoinAccount();
	public List<Category> queryJoinAccount(int page,int rows);
	public List<Category> queryJoinAccount(String type,int page,int rows);
	public void deleteByIds(String ids);
}
