package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/public/head.jspf");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t");
      out.write("  \n");
      out.write("  \n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("<title>shop</title>  \n");
      out.write("\n");
      out.write("<!-- css -->\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shop }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css_admin/style.css\" type=\"text/css\"> \n");
      out.write("\n");
      out.write("<!-- 下面是easyui的环境 -->  \n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shop }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/easyui-1.4.4/themes/icon.css\" type=\"text/css\"></link>  \n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shop }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/easyui-1.4.4/themes/default/easyui.css\" type=\"text/css\"></link>  \n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shop }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/easyui-1.4.4/jquery.min.js\"></script>  \n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shop }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/easyui-1.4.4/jquery.easyui.min.js\"></script>  \n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shop }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/easyui-1.4.4/locale/easyui-lang-zh_CN.js\"></script>");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shop}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/public.css\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shop}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/style.css\" />\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\t#dd div{\n");
      out.write("\t\t\tpadding: 5px;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"wrapper\">\n");
      out.write("\t\t<div class=\"header\">\n");
      out.write("\t\t\t<div class=\"header_container\">\n");
      out.write("\t\t\t\t<!--头部开始-->\n");
      out.write("\t\t\t\t<div class=\"top_bar clear\">\n");
      out.write("\t\t\t\t\t<!--头部小导航-->\n");
      out.write("\t\t\t\t\t<div class=\"welcom fl\">欢迎光临LEISUPET SHOP!</div>\n");
      out.write("\t\t\t\t\t<ul class=\"top_links fr\">\n");
      out.write("\t\t\t\t\t\t<li class=\"highlight\"><a href=\"index.jsp\">首页</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">我的账户</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"sorder_queryUnfinish.action\">购物车</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">注册</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"login.jsp\">登录</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<!--头部小导航结束-->\n");
      out.write("\t\t\t\t\t<!-- logo -->\n");
      out.write("\t\t\t\t\t<h1 class=\"logo clear fl\">\n");
      out.write("\t\t\t\t\t\t<a href=\"index.html\"> <img src=\"images/logo.png\" /> </a>\n");
      out.write("\t\t\t\t\t</h1>\n");
      out.write("\t\t\t\t\t<!-- 小购物车 -->\n");
      out.write("\t\t\t\t\t<div class=\"minicart\">\n");
      out.write("\t\t\t\t\t\t<a class=\"minicart_link\" href=\"#\"> <span class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- 小购物车结束 -->\n");
      out.write("\t\t\t\t\t<!-- 搜索框 -->\n");
      out.write("\t\t\t\t\t<div class=\"header_search\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-search \">\n");
      out.write("\t\t\t\t\t\t\t<input value=\"请输入商品名称\" class=\"input-text\" type=\"text\" />\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" title=\"Search\"></button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- 头部结束 -->\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"section_container\">\n");
      out.write("\t\t\t<!-- 购物车 -->\n");
      out.write("\t\t\t<div id=\"dd\" class=\"action_buttonbar\" style=\"text-align:center;\">\n");
      out.write("\t\t\t\t<form method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shop}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user_login.action\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<label for=\"login\">账号:&nbsp;</label> \n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"login\" value=\"user\"/>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<label for=\"pass\">密码:&nbsp</label> \n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"pass\" value=\"user\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"登陆\" style=\"width:60px;height:30px\" />\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" value=\"注册\" onclick=\"window.open('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shop}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index.jsp','_self')\" style=\"width:60px;height:30px\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t   </form>\n");
      out.write("\t\t\t   <div style=\"clear:both\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t<!-- 导航栏结束 -->\n");
      out.write("\t\t\t<div class=\"footer_container\">\n");
      out.write("\t\t\t\t<div class=\"footer\">\n");
      out.write("\t\t\t\t\t<ul class=\"footer_links\">\n");
      out.write("\t\t\t\t\t\t<li><span>收藏本店</span>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">服装</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">鞋子</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">包包</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">装饰品</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">channel</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">prada</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">LV</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"seperator\"><span>出售的品牌</span>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Elle</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Reallxe</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Fabric</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Mayflower</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Levis Strauss</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Anzonica</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Reallxe</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Fabric</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t\t<li><span>客户服务</span>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">帮助</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">速递</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">退换货</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">付款方式</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">订单跟踪</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">礼物包选项</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">国际服务</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">退运险</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t\t<li><span>个人账户</span>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">个人账户信息</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">用户密码</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">订单历史</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">付款方式</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">我的收货地址</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">我的通知</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_0.setVar("shop");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
