package cn.sakuraffy.shop.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.sakuraffy.shop.model.Product;
import cn.sakuraffy.shop.service.ProductService;

@Service("productService")
public class ProductServiceImpl extends BaseServiceImpl<Product>
				implements ProductService {

	@Override
	public Long total(String name) {
		return productDao.total(name);		
	}

	@Override
	public List<Product> queryJoinCategory(String name, int page, int rows) {
		return productDao.queryJoinCategory(name, page, rows);
	}

	@Override
	public void deleteByIds(String ids) {
		productDao.deleteByIds(ids);
	}

	@Override
	public List<Product> queryByCategoryId(int id) {
		return productDao.queryByCategoryId(id);
	}

}
