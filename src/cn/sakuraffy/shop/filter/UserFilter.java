package cn.sakuraffy.shop.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		
		if (request.getSession().getAttribute("user") == null) {
			// 保存当前客户想要去的url地址
			String goUrl = request.getServletPath();
			String param = request.getQueryString();
			if (param != null) {
				// 拼接url
				goUrl = goUrl + "?" + param;  
			}
			request.getSession().setAttribute("goUrl", goUrl);
			response.sendRedirect(request.getContextPath() + "/login.jsp");
		} else {
			chain.doFilter(request, response);
		}
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		
	}

}
