package cn.sakuraffy.shop.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sakuraffy.shop.mapper.CategoryMapper;
import cn.sakuraffy.shop.model.Category;
import cn.sakuraffy.shop.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl extends BaseServiceImpl<Category> 
					implements CategoryService {
	
	@Resource
	private CategoryMapper categoryMapper;
	
	@Override
	public List<Category> queryJoinAccount() {
		return categoryMapper.queryJoinAccountAll();
	}

	@Override
	public List<Category> queryJoinAccount(int page, int rows) {
		return queryJoinAccount("", page, rows);
	}
	
	@Override
	public List<Category> queryJoinAccount(String type,int page, int rows) {
		Map<String,Object> map = new HashMap<>();
		map.put("type", "%" + type + "%");
		map.put("startNum", (page-1)*rows);
		map.put("rows", rows);
		return categoryMapper.queryJoinAccount(map);
	}

	@Override
	public Long total() {
		return total("");
	}

	@Override
	public Long total(String type) {
		return categoryMapper.total("%" + type + "%");
	}

	@Override
	public void deleteByIds(String ids) {
		categoryDao.deleteByIds(ids);
	}

	@Override
	public List<Category> queryByHot(boolean hot) {
		return categoryMapper.queryByHot(hot);
	}

	@Override
	public List<Category> query() {
		return categoryMapper.query();
	}
}
