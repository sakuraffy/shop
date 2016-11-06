package cn.sakuraffy.shop.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.sakuraffy.shop.model.Product;
import cn.sakuraffy.shop.model.Sorder;
import cn.sakuraffy.shop.service.SorderService;

@Service("soderService")
@SuppressWarnings("unchecked")
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
		String hql = "from Sorder s where s.order.id = null";
		return getSession().createQuery(hql).list();
	}

	@Override
	public Sorder getById(int id) {
		String hql = "from Sorder s where s.product.id = :id and s.order.id = null";
		return (Sorder) getSession().createQuery(hql)
				.setInteger("id", id)
				.uniqueResult();
	}

	@Override
	public void updateByNumber(int number, int id) {
		String hql = "update Sorder s set s.number = :number where s.id = id";
		getSession().createQuery(hql)
				.setInteger("number", number)
				.setInteger("id", id)
				.executeUpdate();
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
		String hql = "select s.name, sum(s.number) from Sorder s "
				+ "join s.product group by s.product.id";
		return getSession().createQuery(hql)
				.setFirstResult(0)
				.setMaxResults(number)
				.list();
	}

}
