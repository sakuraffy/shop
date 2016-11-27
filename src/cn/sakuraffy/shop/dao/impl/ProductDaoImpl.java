package cn.sakuraffy.shop.dao.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.sakuraffy.shop.dao.ProductDao;
import cn.sakuraffy.shop.model.Product;

@Service("productDao")
@SuppressWarnings("unchecked")
public class ProductDaoImpl extends BaseDaoImpl<Product>
				implements ProductDao {

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

	@Override
	public List<Product> queryByCategoryId(int id) {
		String hql = "from Product p where p.category.id = :id";
		return getSession().createQuery(hql)
				.setInteger("id", id)
				.list();
	}

}
