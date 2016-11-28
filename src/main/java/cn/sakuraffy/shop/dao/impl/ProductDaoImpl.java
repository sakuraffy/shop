package cn.sakuraffy.shop.dao.impl;

import org.springframework.stereotype.Service;

import cn.sakuraffy.shop.dao.ProductDao;
import cn.sakuraffy.shop.model.Product;

@Service("productDao")
public class ProductDaoImpl extends BaseDaoImpl<Product>
				implements ProductDao {	

	@Override
	public void deleteByIds(String ids) {
		String hql = "delete from Product p where p.id in (" + ids + ")";
		getSession().createQuery(hql).executeUpdate();
	}

}
