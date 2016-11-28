package cn.sakuraffy.shop.dao;

import cn.sakuraffy.shop.model.Category;

public interface CategoryDao extends BaseDao<Category>{
	public void deleteByIds(String ids);
}
