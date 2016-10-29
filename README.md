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
	
	4. 搭建Struts2的开发环境并整合Spring
		4.1 添加相应的jar包，并在web.xml中配置StrutsPrepareAndExecuteFilter过滤器
		4.2 创建Action并且配置到struts.xml文件中
		4.3 通过jsp访问Action，如果Action可以创建，则表示struts2环境OK
		4.4 默认在没有整合的时候创建Action的工厂为：Choosing bean (struts) for (com.opensymphony.xwork2.ObjectFactory)
		4.5 添加相应的jar包：spring4.2.4-web.jar 里面包括struts2-spring-plugin-2.3.24.1.jar
		4.6 把Action和它的依赖交给Spring管理，配置一下beans.xml
		4.7 在struts.xml中class对应的是Spring中配置action的id值
		4.8 在web.xml中配置监听器ContextLoaderListener，启动的时候加载Spring配置文件
		Choosing bean (spring) for (com.opensymphony.xwork2.ObjectFactory)	

正式开发
	1. 通过反射与泛型抽取Service层
		1.1 添加BaseSevice和BaseServiceImpl
		1.2 完成通用方法增删改查
		1.3 通过反射获得泛型类型参数
		1.4 懒加载BaseAction
		1.5 添加AcoountService和AccountServiceImpl测试
		
	2. 抽取Action层
		2.1 添加数据域request，session，application和相应aware接口
		2.2 添加ModelDriven 减少参数前缀
		2.3 将service对象统一放在BaseAction中
	
	3. 用注解替换xml
		3.1 替换Service
		3.2 替换Controller
		3.3 替换Entry  --在sessionFactory中使用packagesToScan
		
	4. 用easyUI搭建后台
		4.1 加入easyUI相关的文件
		4.2 将页面公共信息抽取为head.jspf
		4.3 加入easyUI东西南北中的布局
		4.4 利用ajax动态加载tabs
		
	5. Account与Category级联查询与分组
		5.1 添加Category实体及@ManyToOne注解
		5.2 修改Account @OneToMany注解
		5.3 添加CategoryService及CategoryServiceImpl
		5.4 在test中添加测试CategoryServiceTest
		
	6. 以Json的形式在easyUI中展示查询结果
		6.1 加入与json有关的jar包
		6.2 添加CategoryAction，修改BaseAction
		6.3 修改struts.xml
		6.4 使用easyUI中DataGrid展示数据

	7. 添加Category的搜索与删除
		7.1 搜索逻辑 ： 获取值并reload
		7.2 多条删除，通过stream返回操作结果
	
	8. 添加Category的增加与修改
		8.1在toolbar中加入增加与修改标签
		8.2添加save.jsp并添加业务逻辑
		8.3添加update.jsp并添加业务逻辑
		8.4修改AccountAction中的query()，使用json传递list数据
		8.5修改struts.xml
			