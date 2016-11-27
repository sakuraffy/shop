package org.apache.jsp.WEB_002dINF.category;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class save_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
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
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\tform div {\n");
      out.write("\t\t\tmargin:5px;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(function(){\n");
      out.write("\t\t\t$(\"input[name=type]\").validatebox({\n");
      out.write("\t\t\t\trequired:true,\n");
      out.write("\t\t\t\tmissingMessage:'请输入类别名称'\n");
      out.write("\t\t\t});\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t//对管理员的下拉列表框进行远程加载\n");
      out.write("\t\t\t$(\"#cc\").combobox({   \n");
      out.write("\t\t\t\t//将请求发送给accountAction中的query方法处理，这里需要将处理好的数据返回到这边来显示了 ，所以后台需要将数据打包成json格式发过来\n");
      out.write("\t\t\t    url:'account_query.action',  \n");
      out.write("\t\t\t    valueField:'id',    \n");
      out.write("\t\t\t    textField:'login', //我们下拉列表中显示的是管理员的登录名\n");
      out.write("\t\t\t    panelHeight:'auto', //自适应高度\n");
      out.write("\t\t\t    panelWidth:120,//下拉列表是两个组件组成的\n");
      out.write("\t\t\t    width:120, //要同时设置两个宽度才行\n");
      out.write("\t\t\t    editable:false //下拉框不允许编辑\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t//窗体弹出默认时禁用验证\n");
      out.write("\t\t\t$(\"#ff\").form(\"disableValidation\");\n");
      out.write("\t\t\t//注册button的事件\n");
      out.write("\t\t\t$(\"#btn\").click(function(){\n");
      out.write("\t\t\t\t//开启验证\n");
      out.write("\t\t\t\t$(\"#ff\").form(\"enableValidation\");\n");
      out.write("\t\t\t\t//如果验证成功，则提交数据\n");
      out.write("\t\t\t\tif($(\"#ff\").form(\"validate\")) {\n");
      out.write("\t\t\t\t\t//调用submit方法提交数据\n");
      out.write("\t\t\t\t\t$(\"#ff\").form('submit', {\n");
      out.write("\t\t\t\t\t\turl: 'category_save.action',\n");
      out.write("\t\t\t\t\t\tsuccess: function(){\n");
      out.write("\t\t\t\t\t\t\t//如果成功了，关闭当前窗口\n");
      out.write("\t\t\t\t\t\t\tparent.$(\"#win\").window(\"close\");\n");
      out.write("\t\t\t\t\t\t\t//刷新页面 :获取aindex-->iframe-->datagrid\n");
      out.write("\t\t\t\t\t\t\t//这里有点难理解\n");
      out.write("\t\t\t\t\t\t\t//var dg = parent.$(\"iframe[title='类别管理']\").contains().find(\"#dg\").datagrid(\"reload\");\n");
      out.write("\t\t\t\t\t\t\tparent.$(\"iframe[title='类别管理']\").get(0).contentWindow.$(\"#dg\").datagrid(\"reload\");\n");
      out.write("\t\t\t\t\t\t\t//alert(dg);\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("  <body>\n");
      out.write("  \t<form id=\"ff\" method=\"post\">   \n");
      out.write("\t    <div>   \n");
      out.write("\t        <label for=\"name\">类别名称:</label> <input type=\"text\" name=\"type\" />   \n");
      out.write("\t    </div>   \n");
      out.write("\t    <div>\n");
      out.write("\t\t\t<label>所属管理员：</label> \n");
      out.write("\t\t\t<input id=\"cc\" name=\"account.id\"/>\n");
      out.write("\t\t</div>\n");
      out.write("\t    <div>   \n");
      out.write("\t        <label for=\"hot\">热点:</label>   \n");
      out.write("\t        \t是<input type=\"radio\" name=\"hot\" value=\"true\" />&nbsp;\n");
      out.write("\t        \t否 <input type=\"radio\" name=\"hot\" value=\"true\" />\n");
      out.write("\t    </div>  \n");
      out.write("\t    <div>\n");
      out.write("\t    \t<a id=\"btn\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-add'\">添加</a>  \n");
      out.write("\t    </div>  \n");
      out.write("\t</form>  \t\n");
      out.write("  </body>\n");
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
