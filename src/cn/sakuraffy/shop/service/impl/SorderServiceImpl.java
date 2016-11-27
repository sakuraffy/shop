package cn.sakuraffy.shop.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.sakuraffy.shop.model.Product;
import cn.sakuraffy.shop.model.Sorder;
import cn.sakuraffy.shop.service.SorderService;

@Service("soderService")
public class SorderServiceImpl extends BaseServiceImpl<Sorder>
				implements SorderService {

	@Override
	public Sorder productToSorder(Product product, int number) {
		Sorder sorder = new Sorder();
		sorder.setName(product.getName());
		sorder.setNumber(number);
		sorder.setPrice(product.getPrice());
		sorder.setProduct(product);
		return sorder;
	}

	@Override
	public List<Sorder> queryUnfinish() {
		return sorderDao.queryUnfinish();
	}

	@Override
	public Sorder getById(int id) {
		return sorderDao.getById(id);
	}

	@Override
	public void updateByNumber(int number, int id) {
		sorderDao.updateByNumber(number, id);
	}

	@Override
	public Double culTotal(List<Sorder> sorders) {
		double total = 0;
		for(Sorder sorder : sorders) {
			total += sorder.getPrice() * sorder.getNumber();
		}
		return total;
	}

	@Override
	public List<Object> querySale(int number) {
		return sorderDao.querySale(number);
	}

}
