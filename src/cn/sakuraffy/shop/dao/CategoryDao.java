package cn.sakuraffy.shop.dao;

import java.util.List;

import cn.sakuraffy.shop.model.Category;

public interface CategoryDao extends BaseDao<Category>{
	public Long total(String type);
	public List<Category> queryByHot(boolean hot);
	public List<Category> queryJoinAccount();
	public List<Category> queryJoinAccount(String type,int page,int rows);
	public void deleteByIds(String ids);
}
