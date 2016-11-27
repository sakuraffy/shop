package cn.sakuraffy.shop.dao;

import cn.sakuraffy.shop.model.User;

public interface UserDao extends BaseDao<User> {
	public User login(User user);
}
