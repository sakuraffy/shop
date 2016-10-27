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