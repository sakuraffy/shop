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
	public List<Category> queryJoinAccount() {
		String hql = "from Category c left join fetch c.account";
		return getSession().createQuery(hql).list();
	}

	@Override
	public List<Category> queryJoinAccount(int page, int rows) {
		String hql = "from Category c left join fetch c.account";
		return getSession().createQuery(hql)
				.setFirstResult((page-1)*rows)
				.setMaxResults(rows)
				.list();
	}

	@Override
	public Long total() {
		String hql = "select count(*) from Category";
		return (Long) getSession().createQuery(hql).uniqueResult();
	}

}
