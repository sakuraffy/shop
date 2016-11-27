package cn.sakuraffy.shop.service;

import java.util.List;

import cn.sakuraffy.shop.model.Product;
import cn.sakuraffy.shop.model.Sorder;

public interface SorderService extends BaseService<Sorder> {
	Sorder productToSorder(Product product, int number);
	List<Sorder> queryUnfinish();
	Sorder getById(int id);
	void updateByNumber(int number, int id);
	Double culTotal(List<Sorder> sorders);
	public List<Object> querySale(int number);
}
