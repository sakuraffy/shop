package cn.sakuraffy.shop.service;

import java.util.List;

public interface BaseService<T> {
	public T getById(int id);
	public void save(T t);
	public void update(T t);
	public void delete(int id);
	public List<T> query();
}
