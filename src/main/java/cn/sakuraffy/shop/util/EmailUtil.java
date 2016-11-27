package cn.sakuraffy.shop.util;

import cn.sakuraffy.shop.model.Order;
import cn.sakuraffy.shop.model.User;

public interface EmailUtil {
	public void sendEmail(User user, Order order);
}
