package cn.sakuraffy.shop.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.sakuraffy.shop.model.Category;
import cn.sakuraffy.shop.service.CategoryService;

@SuppressWarnings("unchecked")
@Service("categoryService")
public class CategoryServiceImpl extends BaseServiceImpl<Category> 
					implements CategoryService {

	@Override
	public List<Category> queryJoinAccount(String type) {
		String hql = "from Category c left join fetch c.account where c.type like :type";
		return getSession().createQuery(hql)
				.setString("type", "%" + type + "%")
				.list();
	}

	@Override
	public List<Category> queryJoinAccount(String type, int page, int size) {
		String hql = "from Category c left join fetch c.account where c.type like :type";
		return getSession().createQuery(hql)
				.setString("type", "%" + type + "%")
				.setFirstResult((page-1)*size)
				.setMaxResults(size)
				.list();
	}

}
