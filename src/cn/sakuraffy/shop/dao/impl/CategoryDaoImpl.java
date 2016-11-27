package cn.sakuraffy.shop.dao.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.sakuraffy.shop.dao.CategoryDao;
import cn.sakuraffy.shop.model.Category;

@SuppressWarnings("unchecked")
@Service("categoryDao")
public class CategoryDaoImpl extends BaseDaoImpl<Category> 
					implements CategoryDao {

	@Override
	public List<Category> queryJoinAccount() {
		String hql = "from Category c left join fetch c.account";
		return getSession().createQuery(hql).list();
	}
	
	@Override
	public List<Category> queryJoinAccount(String type,int page, int rows) {
		String hql = "from Category c left join fetch c.account where c.type like :type";
		return getSession().createQuery(hql)
				.setString("type", "%" + type + "%")
				.setFirstResult((page-1)*rows)
				.setMaxResults(rows)
				.list();
	}

	@Override
	public Long total(String type) {
		String hql = "select count(*) from Category c where c.type like :type";
		return (Long) getSession().createQuery(hql)
				.setString("type", "%" + type + "%")
				.uniqueResult();
	}

	@Override
	public void deleteByIds(String ids) {
		String hql = "delete from Category c where c.id in (" + ids +  ")";
		getSession().createQuery(hql).executeUpdate();
	}

	@Override
	public List<Category> queryByHot(boolean hot) {
		String hql = "from Category c where c.hot = :hot";
		return getSession().createQuery(hql)
				.setBoolean("hot", hot)
				.list();
	}

}
