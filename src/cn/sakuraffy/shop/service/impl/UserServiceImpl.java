package cn.sakuraffy.shop.service.impl;

import org.hibernate.Session;

import cn.sakuraffy.shop.model.User;
import cn.sakuraffy.shop.service.UserService;
import cn.sakuraffy.shop.util.HibernateSessionFactory;

public class UserServiceImpl implements UserService{

	@Override
	public void save(User user) {
		Session session = HibernateSessionFactory.getSession();
		try {
			// 开启事务
			session.beginTransaction();
			session.save(user);
			System.out.println("save success");
			// 提交事务
			session.getTransaction().commit();
		} catch(Exception e) {
			// 事务失败，回滚
			session.getTransaction().rollback();
			throw new RuntimeException();
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

}
