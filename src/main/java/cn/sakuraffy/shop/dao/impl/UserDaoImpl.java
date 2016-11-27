package cn.sakuraffy.shop.dao.impl;

import org.springframework.stereotype.Service;

import cn.sakuraffy.shop.dao.UserDao;
import cn.sakuraffy.shop.model.User;

@Service("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> 
			implements UserDao {

	@Override
	public User login(User user) {
		String hql = "from User u where u.login = :login and pass = :pass";
		return (User) getSession().createQuery(hql)
			.setString("login", user.getLogin())
			.setString("pass", user.getPass())
			.uniqueResult();
	}

}
