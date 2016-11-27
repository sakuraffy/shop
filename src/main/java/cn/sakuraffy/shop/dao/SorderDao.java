package cn.sakuraffy.shop.dao;

import java.util.List;

import cn.sakuraffy.shop.model.Sorder;

public interface SorderDao extends BaseDao<Sorder> {
	List<Sorder> queryUnfinish();
	Sorder getById(int id);
	void updateByNumber(int number, int id);
	public List<Object> querySale(int number);
}
