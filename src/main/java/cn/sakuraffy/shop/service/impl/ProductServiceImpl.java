package cn.sakuraffy.shop.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sakuraffy.shop.mapper.ProductMapper;
import cn.sakuraffy.shop.model.Product;
import cn.sakuraffy.shop.service.ProductService;

@Service("productService")
public class ProductServiceImpl extends BaseServiceImpl<Product>
				implements ProductService {

	@Resource
	private ProductMapper ProductMapper;
	
	@Override
	public Long total(String name) {
		return ProductMapper.total("%" + name + "%");		
	}

	@Override
	public List<Product> queryJoinCategory(String name, int page, int rows) {
		Map<String,Object> map = new HashMap<>();
		map.put("name", "%"+ name +"%");
		map.put("startNum", (page-1)*rows);
		map.put("rows", rows);
		return ProductMapper.queryJoinCategory(map);
	}

	@Override
	public void deleteByIds(String ids) {
		productDao.deleteByIds(ids);
	}

	@Override
	public List<Product> queryByCategoryId(int id) {
		return ProductMapper.queryByCategoryId(id);
	}

}
