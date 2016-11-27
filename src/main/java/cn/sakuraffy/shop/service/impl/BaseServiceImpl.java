package cn.sakuraffy.shop.service.impl;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import cn.sakuraffy.shop.dao.AccountDao;
import cn.sakuraffy.shop.dao.BaseDao;
import cn.sakuraffy.shop.dao.CategoryDao;
import cn.sakuraffy.shop.dao.OrderDao;
import cn.sakuraffy.shop.dao.ProductDao;
import cn.sakuraffy.shop.dao.SorderDao;
import cn.sakuraffy.shop.dao.UserDao;
import cn.sakuraffy.shop.service.BaseService;

@SuppressWarnings("unchecked")
public class BaseServiceImpl<T> implements BaseService<T> {

	private BaseDao<T> baseDao;
	protected Class<T> clazz;
	
	@Resource
	protected AccountDao accountDao;
	@Resource
	protected CategoryDao categoryDao;
	@Resource
	protected OrderDao orderDao;
	@Resource
	protected ProductDao productDao;
	@Resource
	protected SorderDao sorderDao;
	@Resource
	protected UserDao userDao;
	
	public BaseServiceImpl() {
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		clazz = (Class<T>) type.getActualTypeArguments()[0];
	}
	
	@PostConstruct
	public void init() throws Exception {
		String className = clazz.getSimpleName();
		String classDaoName = className.substring(0,1).toLowerCase()
				+ className.substring(1) + "Dao";
		
		Field baseField = this.getClass().getSuperclass().getDeclaredField("baseDao");
		Field classField = this.getClass().getSuperclass().getDeclaredField(classDaoName);
		baseField.set(this, classField.get(this));
	}
	
	@Override
	public T getById(int id) {
		return (T) baseDao.getById(id);
	}

	@Override
	public void save(T t) {
		baseDao.save(t);
	}

	@Override
	public void update(T t) {
		baseDao.update(t);
	}

	@Override
	public void delete(int id) {
		baseDao.delete(id);
	}

	@Override
	public List<T> query() {
		return baseDao.query();
	}

}
