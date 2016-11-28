package cn.sakuraffy.shop.mapper;

import java.util.List;
import java.util.Map;

import cn.sakuraffy.shop.model.Product;

public interface ProductMapper {
	public Long total(String name);
	public List<Product> queryByCategoryId(int id);
	public List<Product> queryJoinCategory(Map<String,Object> map);
}
