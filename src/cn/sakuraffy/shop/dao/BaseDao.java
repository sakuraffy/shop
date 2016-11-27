package cn.sakuraffy.shop.dao;

import java.util.List;

public interface BaseDao<T> {
	public T getById(int id);
	public void save(T t);
	public void update(T t);
	public void delete(int id);
	public List<T> query();
}
