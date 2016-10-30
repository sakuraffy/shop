package cn.sakuraffy.shop.action;

import java.io.InputStream;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.sakuraffy.shop.service.AccountService;
import cn.sakuraffy.shop.service.CategoryService;
import cn.sakuraffy.shop.service.ProductService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller(value="baseAction")
@Scope("prototype")
public class BaseAction<T> extends ActionSupport implements RequestAware, SessionAware
				, ApplicationAware, ModelDriven<T>{

	private static final long serialVersionUID = 1L;

	// 数据域
	protected Map<String,Object> request;
	protected Map<String,Object> session;
	protected Map<String,Object> application;
	
	// ModelDriven 减少参数的前缀
	protected T model;
	
	// 添加分页
	protected int page;
	protected int rows;
	protected Map<String,Object> jsonMap;
	
	// 列表以json形式传递到后台管理
	protected List<T> jsonList;
	
	// delete ids
	protected String ids;
	protected InputStream jsonStream;
	
	// service 对象
	@Resource
	protected AccountService accountService;
	@Resource
	protected CategoryService categoryService;
	@Resource
	protected ProductService productService;
	
	public final String getIds() {
		return ids;
	}
	public final void setIds(String ids) {
		this.ids = ids;
	}
	
	public final void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	public final void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public final void setApplication(Map<String, Object> application) {
		this.application = application;
	}
	
	public final int getPage() {
		return page;
	}
	public final void setPage(int page) {
		this.page = page;
	}
	public final int getRows() {
		return rows;
	}
	public final void setRows(int rows) {
		this.rows = rows;
	}
	
	public final Map<String, Object> getJsonMap() {
		return jsonMap;
	}
	public final void setJsonMap(Map<String, Object> jsonMap) {
		this.jsonMap = jsonMap;
	}
	public final InputStream getJsonStream() {
		return jsonStream;
	}
	public final void setJsonStream(InputStream jsonStream) {
		this.jsonStream = jsonStream;
	}
	public final List<T> getJsonList() {
		return jsonList;
	}
	public final void setJsonList(List<T> jsonList) {
		this.jsonList = jsonList;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public T getModel() {
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		Class clazz = (Class) type.getActualTypeArguments()[0];
		try {
			model = (T) clazz.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}
	
}
