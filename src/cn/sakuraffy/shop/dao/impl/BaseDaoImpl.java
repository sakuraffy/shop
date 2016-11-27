package cn.sakuraffy.shop.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import cn.sakuraffy.shop.dao.BaseDao;

@SuppressWarnings("unchecked")
@Repository("baseDao")
@Lazy(true)
public class BaseDaoImpl<T> implements BaseDao<T> {

	private Class<T> clazz;
	
	public BaseDaoImpl() {
		ParameterizedType type =(ParameterizedType) this.getClass().getGenericSuperclass();
		clazz = (Class<T>) type.getActualTypeArguments()[0];
	}
	
	@Resource
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public T getById(int id) {
		return (T) getSession().get(clazz, id);
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
		String hql = "DELETE FROM " + clazz.getSimpleName() +" c WHERE c.id = :id";
		getSession().createQuery(hql)
			.setInteger("id", id)
			.executeUpdate();
	}

	@Override
	public List<T> query() {
		String hql = "FROM " + clazz.getSimpleName();
		return getSession().createQuery(hql)
			.list();
	}

}
