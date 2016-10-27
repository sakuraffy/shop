package cn.sakuraffy.shop.service.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import cn.sakuraffy.shop.service.BaseService;

@Transactional
@SuppressWarnings("unchecked")
@Service(value="baseService")
@Lazy(value=true)
public class BaseServiceImpl<T> implements BaseService<T> {
	@Resource
	private SessionFactory sessionFactory;
	private Class<T> clazz;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("rawtypes")
	public BaseServiceImpl() {
		// 获取泛型参数类型
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		clazz = (Class) type.getActualTypeArguments()[0];
	}

	@Override
	public void save(T t) {
		getSession().save(t);
	}

	@Override
	public void update(T t) {
		getSession().update(t);
	}
	
	@Override
	public void delete(int id) {
		String hql = "delete " + clazz.getSimpleName() + " c where c.id = :id";
		getSession().createQuery(hql).setInteger("id", id).executeUpdate();
	}

	@Override
	public T get(int id) {
		return (T) getSession().get(clazz, id);
	}

	@Override
	public List<T> query() {
		String hql = "from " + clazz.getSimpleName();
		return getSession().createQuery(hql).list();
	}

}
