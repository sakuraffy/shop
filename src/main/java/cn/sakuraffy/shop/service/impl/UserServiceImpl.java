package cn.sakuraffy.shop.service.impl;

import org.springframework.stereotype.Service;

import cn.sakuraffy.shop.model.User;
import cn.sakuraffy.shop.service.UserService;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> 
			implements UserService {

	@Override
	public User login(User user) {
		return userDao.login(user);
	}

}
