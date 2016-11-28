package cn.sakuraffy.shop.dao;

import cn.sakuraffy.shop.model.Product;

public interface ProductDao extends BaseDao<Product> {	
	public void deleteByIds(String ids);
}
