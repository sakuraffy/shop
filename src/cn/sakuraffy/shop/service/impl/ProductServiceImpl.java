package cn.sakuraffy.shop.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.sakuraffy.shop.model.Product;
import cn.sakuraffy.shop.service.ProductService;

@Service("productService")
@SuppressWarnings("unchecked")
public class ProductServiceImpl extends BaseServiceImpl<Product>
				implements ProductService {

	@Override
	public Long total(String name) {
		String hql = "select count(*) from Product p where p.name like :name";
		return (Long) getSession().createQuery(hql)
				.setString("name", "%" + name + "%")
				.uniqueResult();			
	}

	@Override
	public List<Product> queryJoinCategory(String name, int page, int rows) {
		String hql = "from Product p left join fetch p.category where p.name like :name";
		return getSession().createQuery(hql)
				.setString("name", "%" + name + "%")
				.setFirstResult((page-1) * rows)
				.setMaxResults(rows)
				.list();
	}

	@Override
	public void deleteByIds(String ids) {
		String hql = "delete from Product p where p.id in (" + ids + ")";
		getSession().createQuery(hql).executeUpdate();
	}

}
