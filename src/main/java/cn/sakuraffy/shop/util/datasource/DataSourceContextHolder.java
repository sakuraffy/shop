package cn.sakuraffy.shop.util.datasource;

public class DataSourceContextHolder {
	
	private static  final ThreadLocal<DataSourceType> contextHolder 
				= new ThreadLocal<>();
	
	public static void setDataSourceType(DataSourceType type) {
		System.out.println(type);
		contextHolder.set(type);
	}
	
	public static DataSourceType getDataSourceType() {
		return contextHolder.get();
	}
	
	public static void clearDataSourceType() {
		contextHolder.remove();
	}
}
