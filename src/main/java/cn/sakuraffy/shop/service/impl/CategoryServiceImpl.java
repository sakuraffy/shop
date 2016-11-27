package cn.sakuraffy.shop.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.sakuraffy.shop.model.Category;
import cn.sakuraffy.shop.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl extends BaseServiceImpl<Category> 
					implements CategoryService {
	
	@Override
	public List<Category> queryJoinAccount() {
		return categoryDao.queryJoinAccount();
	}

	@Override
	public List<Category> queryJoinAccount(int page, int rows) {
		return queryJoinAccount("", page, rows);
	}
	
	@Override
	public List<Category> queryJoinAccount(String type,int page, int rows) {
		return categoryDao.queryJoinAccount(type, page, rows);
	}

	@Override
	public Long total() {
		return total("");
	}

	@Override
	public Long total(String type) {
		return categoryDao.total(type);
	}

	@Override
	public void deleteByIds(String ids) {
		categoryDao.deleteByIds(ids);
	}

	@Override
	public List<Category> queryByHot(boolean hot) {
		return categoryDao.queryByHot(hot);
	}

}
