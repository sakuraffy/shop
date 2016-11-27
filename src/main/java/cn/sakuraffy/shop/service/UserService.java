package cn.sakuraffy.shop.service;

import cn.sakuraffy.shop.model.User;

public interface UserService extends BaseService<User> {
	public User login(User user);
}
