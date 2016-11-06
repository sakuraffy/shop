package cn.sakuraffy.shop.util;

import cn.sakuraffy.shop.model.Order;
import cn.sakuraffy.shop.model.User;

public interface MessageUtil {
	public void sendMessage(User user, Order order);
}
