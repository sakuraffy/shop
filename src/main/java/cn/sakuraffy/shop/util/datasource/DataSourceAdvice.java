package cn.sakuraffy.shop.util.datasource;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class DataSourceAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) 
			throws Throwable {
		DataSource dataSource = method.getAnnotation(DataSource.class);
		DataSourceType type = dataSource == null ? 
				DataSourceType.MYSQL : dataSource.value();
		DataSourceContextHolder.setDataSourceType(type);
	}

}
