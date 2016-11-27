package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/public/head.jspf");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("  <head>\n");
      out.write("  \t");
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
      out.write("  \t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shop }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/public.css\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shop }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/style.css\" />\n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("  <body>\n");
      out.write("\t<div class=\"wrapper\">\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"header_container\">\n");
      out.write("                <!--头部开始-->\n");
      out.write("                        <div class=\"top_bar clear\">\n");
      out.write("                            <!--头部小导航-->\n");
      out.write("                            <div class=\"welcom fl\">欢迎光临LEISUPET SHOP! </div>\n");
      out.write("                            <ul class=\"top_links fr\">\n");
      out.write("                                <li class=\"highlight\"><a href=\"index.jsp\">首页</a></li>\n");
      out.write("                                <li><a href=\"#\">我的账户</a></li>\n");
      out.write("                                <li><a href=\"sorder_queryUnfinish.action\">购物车</a></li>\n");
      out.write("                                <li><a href=\"#\">注册</a></li>\n");
      out.write("                                <li ><a href=\"login.jsp\">登录</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <!--头部小导航结束-->\n");
      out.write("                            <!-- logo -->\n");
      out.write("                            <h1 class=\"logo clear fl\"> <a href=\"index.html\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shop}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/logo.png\" /></a> </h1>\n");
      out.write("                            <!-- 购物车 -->\n");
      out.write("                            <div class=\"minicart\">\n");
      out.write("                                <a class=\"minicart_link\" href=\"#\">\n");
      out.write("                                    <span class=\"item\">\n");
      out.write("                                        <b>2</b> 件/\n");
      out.write("                                    </span>\n");
      out.write("                                    <span class=\"price\">\n");
      out.write("                                        <b>￥199.80</b>\n");
      out.write("                                    </span>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- 购物车结束 -->\n");
      out.write("                            <!-- 搜索框 -->\n");
      out.write("                            <div class=\"header_search\">\n");
      out.write("                                <div class=\"form-search \">\n");
      out.write("                                    <input  value=\"请输入商品名称\" class=\"input-text\"  type=\"text\"/>\n");
      out.write("                                    <button type=\"submit\" title=\"Search\"></button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                   \n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- 头部结束 -->\n");
      out.write("\n");
      out.write("        <!-- 导航栏 -->\n");
      out.write("        <div class=\"navigation_container\">\n");
      out.write("        <!---->\n");
      out.write("         <div class=\"nav\">\n");
      out.write("            <ul class=\"primary_nav\">\n");
      out.write("                <li class=\"active highlight\"><a href=\"#\">女装</a>\n");
      out.write("                    <!--二级菜单-->\n");
      out.write("                    <ul class=\"sub_menu\">\n");
      out.write("                        <li > <a href=\"#\">裙装</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">短裙</a></li>\n");
      out.write("                                <li><a href=\"#\">短裤 </a></li>\n");
      out.write("                                <li><a href=\"#\">裤子</a></li>\n");
      out.write("                                <li><a href=\"#\">卡其裤</a></li>\n");
      out.write("                                <li><a href=\"#\">休闲裤</a></li>\n");
      out.write("                                <li><a href=\"#\">牛仔裤</a></li>\n");
      out.write("                                <li><a href=\"#\">风衣 & 运动夹克</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li> <a href=\"#\">装饰品 </a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\"> 太阳镜</a></li>\n");
      out.write("                                <li><a href=\"#\">围巾 </a></li>\n");
      out.write("                                <li><a href=\"#\">发饰品 </a></li>\n");
      out.write("                                <li><a href=\"#\">帽子和手套 </a></li>\n");
      out.write("                                <li><a href=\"#\">生活时尚 </a></li>\n");
      out.write("                                <li><a href=\"#\">牛仔系列 </a></li>\n");
      out.write("                                <li><a href=\"#\">风衣 & 西服</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                    <!--二级菜单结束-->\n");
      out.write("                \n");
      out.write("                <li><a href=\"#\">男装</a>\n");
      out.write("                    <!--二级菜单-->\n");
      out.write("                    <ul class=\"sub_menu\">\n");
      out.write("                        <li> <a href=\"#\">男士夏装</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">裤子</a></li>\n");
      out.write("                                <li><a href=\"#\">休闲裤</a></li>\n");
      out.write("                                <li><a href=\"#\">卡其裤</a></li>\n");
      out.write("                                <li><a href=\"#\">牛仔裤</a></li>\n");
      out.write("                                <li><a href=\"#\">风衣 & 运动夹克</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                         <li> <a href=\"#\">装饰品 </a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\"> 太阳镜</a></li>\n");
      out.write("                                <li><a href=\"#\">围巾 </a></li>\n");
      out.write("                                <li><a href=\"#\">发饰品 </a></li>\n");
      out.write("                                <li><a href=\"#\">帽子和手套 </a></li>\n");
      out.write("                                <li><a href=\"#\">生活时尚 </a></li>\n");
      out.write("                                <li><a href=\"#\">牛仔系列 </a></li>\n");
      out.write("                                <li><a href=\"#\">风衣 & 西服</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <!--二级菜单结束-->\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#\">儿童</a></li>\n");
      out.write("                <li><a href=\"#\">时尚</a></li>\n");
      out.write("                <li><a href=\"#\">装饰品 </a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <!--导航栏结束-->\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"section_container\">\n");
      out.write("            <!--左侧导航-->\n");
      out.write("            <div id=\"side_nav\">\n");
      out.write("                <div class=\"sideNavCategories\">\n");
      out.write("                    <h1>女装</h1>\n");
      out.write("                    <ul class=\"category departments\">\n");
      out.write("                        <li class=\"header\">分类</li>\n");
      out.write("                        <li><a href=\"#\">毛衣</a></li>\n");
      out.write("                        <li><a href=\"#\">针织衫 </a></li>\n");
      out.write("                        <li><a href=\"#\">衬衫 </a></li>\n");
      out.write("                        <li><a href=\"#\">T恤</a></li>\n");
      out.write("                        <li><a href=\"#\">短裤</a></li>\n");
      out.write("                        <li><a href=\"#\">牛仔 </a></li>\n");
      out.write("                        <li><a href=\"#\">连身裙</a></li>\n");
      out.write("                        <li><a href=\"#\">短裙 </a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <!-- 右侧焦点图区域 -->\n");
      out.write("            <div id=\"main_content \">\n");
      out.write("                <div > <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shop}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/lm_banner_1.jpg\" /> </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("       <!-- 产品列表 -->\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <!--产品列表结束  -->\n");
      out.write("\n");
      out.write("         <!-- 产品列表 -->\n");
      out.write("            <div class=\"products_list products_slider clear\">\n");
      out.write("                <h2 class=\"sub_title\">新品发售</h2>\n");
      out.write("                <ul id=\"first-carousel\" class=\"first-and-second-carousel jcarousel-skin-tango\">\n");
      out.write("                    <li> <a  href=\"#\" class=\"product_image\"><img src=\"images/pr_l_1.jpg\" /></a>\n");
      out.write("                        <div class=\"product_info\">\n");
      out.write("                            <h3><a href=\"#\">夏季新品长裙</a></h3>\n");
      out.write("                            <small>印花 纯棉</small> </div>\n");
      out.write("                        <div class=\"price_info\"> \n");
      out.write("                            </button><button><span class=\"pr_add\">添加购物车</span></button><button class=\"price_add\" title=\"\" type=\"button\"><span class=\"pr_price\">￥76.00</span>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li> <a  href=\"#\" class=\"product_image\"><img src=\"images/pr_l_2.jpg\" /></a>\n");
      out.write("                        <div class=\"product_info\">\n");
      out.write("                            <h3><a href=\"#\">夏季新品长裙</a></h3>\n");
      out.write("                            <small>印花 纯棉</small> </div>\n");
      out.write("                        <div class=\"price_info\"> \n");
      out.write("                            <button><span class=\"pr_add\">添加购物车</span></button><button class=\"price_add\" title=\"\" type=\"button\"><span class=\"pr_price\">￥76.00</span></button>\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li> <a  href=\"#\" class=\"product_image\"><img src=\"images/pr_l_3.jpg\" /></a>\n");
      out.write("                        <div class=\"product_info\">\n");
      out.write("                            <h3><a href=\"#\">夏季新品长裙</a></h3>\n");
      out.write("                            <small>印花 纯棉</small> </div>\n");
      out.write("                        <div class=\"price_info\"> \n");
      out.write("                            <button><span class=\"pr_add\">添加购物车</span></button><button class=\"price_add\" title=\"\" type=\"button\"><span class=\"pr_price\">￥76.00</span></button>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li> <a  href=\"#\" class=\"product_image\"><img src=\"images/pr_l_5.jpg\" /></a>\n");
      out.write("                        <div class=\"product_info\">\n");
      out.write("                            <h3><a href=\"#\">夏季新品长裙</a></h3>\n");
      out.write("                            <small>印花 纯棉</small> </div>\n");
      out.write("                        <div class=\"price_info\"> \n");
      out.write("                            <button><span class=\"pr_add\">添加购物车</span></button><button class=\"price_add\" title=\"\" type=\"button\"><span class=\"pr_price\">￥76.00</span></button>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li> <a  href=\"#\" class=\"product_image\"><img src=\"images/pr_l_1.jpg\" /></a>\n");
      out.write("                        <div class=\"product_info\">\n");
      out.write("                            <h3><a href=\"#\">夏季新品长裙</a></h3>\n");
      out.write("                            <small>印花 纯棉</small> </div>\n");
      out.write("                        <div class=\"price_info\"> \n");
      out.write("                            <button><span class=\"pr_add\">添加购物车</span></button><button class=\"price_add\" title=\"\" type=\"button\"><span class=\"pr_price\">￥76.00</span></button>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li> <a  href=\"#\" class=\"product_image\"><img src=\"images/pr_l_2.jpg\" /></a>\n");
      out.write("                        <div class=\"product_info\">\n");
      out.write("                            <h3><a href=\"#\">夏季新品长裙</a></h3>\n");
      out.write("                            <small>印花 纯棉</small> </div>\n");
      out.write("                        <div class=\"price_info\"> \n");
      out.write("                            <button><span class=\"pr_add\">添加购物车</span></button><button class=\"price_add\" title=\"\" type=\"button\"><span class=\"pr_price\">￥76.00</span></button>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        <!--产品列表结束  -->\n");
      out.write("        <!-- 导航栏结束 -->\n");
      out.write("            <div class=\"footer_container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <ul class=\"footer_links\">\n");
      out.write("                <li> <span>收藏本店</span>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">服装</a></li>\n");
      out.write("                        <li><a href=\"#\">鞋子</a></li>\n");
      out.write("                        <li><a href=\"#\">包包</a></li>\n");
      out.write("                        <li><a href=\"#\">装饰品</a></li>\n");
      out.write("                        <li><a href=\"#\">channel</a></li>\n");
      out.write("                        <li><a href=\"#\">prada</a></li>\n");
      out.write("                        <li><a href=\"#\">LV</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"seperator\"> <span>出售的品牌</span>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">Elle</a></li>\n");
      out.write("                        <li><a href=\"#\">Reallxe</a></li>\n");
      out.write("                        <li><a href=\"#\">Fabric</a></li>\n");
      out.write("                        <li><a href=\"#\">Mayflower</a></li>\n");
      out.write("                        <li><a href=\"#\">Levis Strauss</a></li>\n");
      out.write("                        <li><a href=\"#\">Anzonica</a></li>\n");
      out.write("                        <li><a href=\"#\">Reallxe</a></li>\n");
      out.write("                        <li><a href=\"#\">Fabric</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li> <span>客户服务</span>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">帮助</a></li>\n");
      out.write("                        <li><a href=\"#\">速递</a></li>\n");
      out.write("                        <li><a href=\"#\">退换货</a></li>\n");
      out.write("                        <li><a href=\"#\">付款方式</a></li>\n");
      out.write("                        <li><a href=\"#\">订单跟踪</a></li>\n");
      out.write("                        <li><a href=\"#\">礼物包选项</a></li>\n");
      out.write("                        <li><a href=\"#\">国际服务</a></li>\n");
      out.write("                        <li><a href=\"#\">退运险</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li> <span>个人账户</span>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">个人账户信息</a></li>\n");
      out.write("                        <li><a href=\"#\">用户密码</a></li>\n");
      out.write("                        <li><a href=\"#\">订单历史</a></li>\n");
      out.write("                        <li><a href=\"#\">付款方式</a></li>\n");
      out.write("                        <li><a href=\"#\">我的收货地址</a></li>\n");
      out.write("                        <li><a href=\"#\">我的通知</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("    </div>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${applicationScope.bigList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("list");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t            <div class=\"products_list products_slider clear\">\n");
          out.write("\t            \t<!-- 显示类别名称 -->\n");
          out.write("\t                <h2 class=\"sub_title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list[0].category.type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("\t                <ul id=\"first-carousel\" class=\"first-and-second-carousel jcarousel-skin-tango\">\n");
          out.write("\t                    ");
          if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t                </ul>\n");
          out.write("\t            </div>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("product");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t                    <li> \n");
          out.write("\t\t                    \t<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shop}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/product_get.action?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"product_image\"><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shop}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/upload/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.pic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" /></a>\n");
          out.write("\t\t                        <div class=\"product_info\">\n");
          out.write("\t\t                            <h3><a href=\"#\">商品名称：");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\n");
          out.write("\t\t                            <small>简单描述：");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.remark}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</small> </div>\n");
          out.write("\t\t                        <div class=\"price_info\"> \n");
          out.write("\t\t                            <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shop}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/sorder_saveToCar.action?product.id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><button><span class=\"pr_add\">添加购物车</span></button></a>\n");
          out.write("\t\t                            <button class=\"price_add\" title=\"\" type=\"button\">\n");
          out.write("\t\t                            \t<span class=\"pr_price\">￥");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("\t\t                            </button>\n");
          out.write("\t\t                        </div>\n");
          out.write("\t\t                    </li>\n");
          out.write("\t                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
