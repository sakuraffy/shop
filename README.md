shop 开发过程

环境搭建
	1. 搭建Spring的开发环境
		1.1 添加配置文件和相应的jar包
		1.2 创建Date对象，如果成功则Spring的IOC环境OK
		1.3 通过基于Spring Junit测试实例化Date 
	
	2. 搭建Hibernate的开发环境
		2.1 添加配置文件和相应的jar包和MySQL的驱动jar包
		2.2 分析cn.it.shop.utils.HibernateSessionFactory.java的作用:加载Hibernate的配置文件，创建session
		2.3 通过逆向工程生成model、orm映射文件
		2.4 创建service,通过new的方式执行数据入库
		
	3. Spring和Hibernate整合（采用AOP来管理事务，实现声明式事务）
		3.1 添加相应的jar包：spring4.2.4-persistence和c3p0-0.9.5.1
		3.2 配置数据源dataSource，然后hibernate.cfg.xml中相应的部分可以干掉了
		3.3 采用sessionFactory取代HibernateTemplate，因为HibernateTemplate是Spring提供的，依赖于Spring,如果哪天不用Spring了，就会报错
			而sessionFactory是Hibernate提供的，没有问题。
		3.4 配置事务管理器，管理sessionFactory,这样所有的session将会有声明式的管理
		3.5 配置advice（通知），通知是指定了哪些方法需要什么类型的事务模式	
		3.6 配置AOP切面表达式
		3.7 让Service交给Spring管理，并且依赖sessionFactory，如果能插入数据，则说明声明事务OK