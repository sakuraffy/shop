package cn.sakuraffy.shop.action;

import java.io.InputStream;
import java.lang.reflect.ParameterizedType;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.sakuraffy.shop.service.AccountService;
import cn.sakuraffy.shop.service.CategoryService;

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
	protected Map<String,Object> pageMap;
	
	// delete ids
	protected String ids;
	protected InputStream inputStream;

	public final InputStream getInputStream() {
		return inputStream;
	}
	public final void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	public final String getIds() {
		return ids;
	}
	public final void setIds(String ids) {
		this.ids = ids;
	}

	// service 对象
	@Resource
	protected AccountService accountService;
	@Resource
	protected CategoryService categoryService;
	
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
	public final Map<String, Object> getPageMap() {
		return pageMap;
	}
	public final void setPageMap(Map<String, Object> pageMap) {
		this.pageMap = pageMap;
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
