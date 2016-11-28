package cn.sakuraffy.shop.dao.impl;

import org.springframework.stereotype.Service;

import cn.sakuraffy.shop.dao.CategoryDao;
import cn.sakuraffy.shop.model.Category;

@Service("categoryDao")
public class CategoryDaoImpl extends BaseDaoImpl<Category> 
					implements CategoryDao {	

	@Override
	public void deleteByIds(String ids) {
		String hql = "delete from Category c where c.id in (" + ids +  ")";
		getSession().createQuery(hql).executeUpdate();
	}

}
