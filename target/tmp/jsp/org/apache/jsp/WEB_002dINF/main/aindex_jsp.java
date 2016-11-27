package org.apache.jsp.WEB_002dINF.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class aindex_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("  \n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">  \n");
      out.write("<html>  \n");
      out.write("<head>  \n");
      out.write("    ");
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
      out.write("  \n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\">  \n");
      out.write("\t    $(function(){  \n");
      out.write("\t        $(\"a[title]\").click(function() {\n");
      out.write("\t        \tvar text = $(this).text();  \n");
      out.write("\t            var href = $(this).attr(\"title\"); \n");
      out.write("\t        \t//判断当前右边是否已有相应的tab  \n");
      out.write("\t            if($(\"#tt\").tabs(\"exists\", text)) {  \n");
      out.write("\t                $(\"#tt\").tabs(\"select\", text);  \n");
      out.write("\t            } else {  \n");
      out.write("\t                //如果没有则创建一个新的tab，否则切换到当前tag  \n");
      out.write("\t                $(\"#tt\").tabs(\"add\",{  \n");
      out.write("\t                    title:text,  \n");
      out.write("\t                    closable:true,  \n");
      out.write("\t                    content:'<iframe title=' + text + ' src=' + href + ' frameborder=\"0\" width=\"100%\" height=\"100%\" />'\n");
      out.write("\t                    //href:默认通过url地址加载远程的页面，但是仅仅是body部分  \n");
      out.write("\t                    //href:'send_category_query.action'  \n");
      out.write("\t                });  \n");
      out.write("\t            }  \n");
      out.write("\t        });\n");
      out.write("\t    });  \n");
      out.write("\t</script>\n");
      out.write("</head>  \n");
      out.write(" \t<body class=\"easyui-layout\">  \n");
      out.write("        <div data-options=\"region:'north',title:'welcome',split:true\" style=\"height:100px;\"></div>     \n");
      out.write("        <div data-options=\"region:'west',title:'West',split:true\" style=\"width:200px;\">  \n");
      out.write("            <!-- 此处显示的是系统菜单 -->  \n");
      out.write("            <div id=\"menu\" class=\"easyui-accordion\" data-options=\"fit:true\">   \n");
      out.write("    \t\t\t<div title=\"基本操作\">   \n");
      out.write("        \t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" title=\"send_category_query.action\">类别管理</a>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" title=\"send_product_query.action\">商品管理</a>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("    \t\t\t</div>   \n");
      out.write("    \t\t\t<div title=\"销售管理\">\n");
      out.write("    \t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" title=\"send_sale_sale.action\">销售管理</a>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("    \t\t\t</div>   \n");
      out.write("\t\t\t</div>   \n");
      out.write("        </div>     \n");
      out.write("        <div data-options=\"region:'center',title:'center title'\" style=\"padding:1px;background:#fff;\">\n");
      out.write("        \t<div id=\"tt\" class=\"easyui-tabs\" data-options=\"fit:true\">   \n");
      out.write("\t\t\t    <div title=\"系统缺省页面\" style=\"padding:10px\">   \n");
      out.write("\t\t\t        \t系统信息   \n");
      out.write("\t\t\t    </div>   \n");
      out.write("\t\t\t</div>\n");
      out.write("        </div> \n");
      out.write("        <div id=\"win\" data-options=\"collapsible:false,minimizable:false,maximizable:false,modal:true\"></div>     \n");
      out.write("    </body>   \n");
      out.write("  \n");
      out.write("</html>");
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
