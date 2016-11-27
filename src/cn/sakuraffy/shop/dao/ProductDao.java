package cn.sakuraffy.shop.dao;

import java.util.List;

import cn.sakuraffy.shop.model.Product;

public interface ProductDao extends BaseDao<Product> {
	public Long total(String name);
	public List<Product> queryJoinCategory(String name, int page, int rows);
	public void deleteByIds(String ids);
	public List<Product> queryByCategoryId(int id);
}
