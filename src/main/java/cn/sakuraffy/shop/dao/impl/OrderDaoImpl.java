package cn.sakuraffy.shop.dao.impl;

import org.springframework.stereotype.Service;

import cn.sakuraffy.shop.dao.OrderDao;
import cn.sakuraffy.shop.model.Order;

@Service("orderDao")
public class OrderDaoImpl extends BaseDaoImpl<Order> 
			implements OrderDao {

	
}
