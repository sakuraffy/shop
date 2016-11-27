package org.apache.jsp.WEB_002dINF.category;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class query_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\tbody {\n");
      out.write("\t\t\tmargin: 1px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.searchbox {\n");
      out.write("\t\t  margin: -3;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(function(){\n");
      out.write("\t\t\t$('#dg').datagrid({   \n");
      out.write("\t\t\t\t//url地址改为请求categoryAction\n");
      out.write("\t\t\t    url:'category/queryJoinAccount.do',\n");
      out.write("\t\t\t    loadMsg:'Loading......',\n");
      out.write("\t\t\t    queryParams:{type:''},//type参数，这里不需要传具体的type，因为我们要显示所有的\n");
      out.write("\t\t\t    //width:300,\n");
      out.write("\t\t\t    fitColumns:true,//水平自动展开，如果设置此属性，则不会有水平滚动条，演示冻结列时，该参数不要设置\n");
      out.write("\t\t\t    //显示斑马线\n");
      out.write("\t\t\t    striped:true,\n");
      out.write("\t\t\t    //当数据多的时候不换行\n");
      out.write("\t\t\t    nowrap:true,\n");
      out.write("\t\t\t    singleSelect:false, //如果为真，只允许单行显示，全显功能失效\n");
      out.write("\t\t\t    //设置分页\n");
      out.write("\t\t\t    pagination:true,\n");
      out.write("\t\t\t    //设置每页显示的记录数，默认是10个\n");
      out.write("\t\t\t\tpageSize:8,\n");
      out.write("\t\t\t\t//设置可选的每页记录数，供用户选择，默认是10,20,30,40...\n");
      out.write("\t\t\t\tpageList:[5,8,10],\n");
      out.write("\t\t\t\tidField:'id',//指定id为标识字段，在删除，更新的时候有用，如果配置此字段，在翻页时，换页不会影响选中的项\n");
      out.write("\t\t\t\ttoolbar: [{\n");
      out.write("\t\t\t\t\ticonCls: 'icon-add',\n");
      out.write("\t\t\t\t\ttext:'添加类别',\n");
      out.write("\t\t\t\t\thandler: function(){\n");
      out.write("\t\t\t\t\t\tparent.$(\"#win\").window({\n");
      out.write("\t\t\t\t\t\t\ttitle:\"添加类别\",\n");
      out.write("\t\t\t\t\t\t\twidth:350,\n");
      out.write("\t\t\t\t\t\t\theight:200,\n");
      out.write("\t\t\t\t\t\t\tcontent:'<iframe src=\"send_category_save.action\" frameborder=\"0\" width=\"100%\" height=\"100%\"/>'\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t},'-',{\n");
      out.write("\t\t\t\t\ticonCls: 'icon-edit',\n");
      out.write("\t\t\t\t\ttext:'更新类别',\n");
      out.write("\t\t\t\t\thandler: function(){\n");
      out.write("\t\t\t\t\t\t//判断是否有选中行记录，使用getSelections获取选中的所有行\n");
      out.write("\t\t\t\t\t\tvar rows = $(\"#dg\").datagrid(\"getSelections\");\n");
      out.write("\t\t\t\t\t\tif(rows.length == 0) {\n");
      out.write("\t\t\t\t\t\t\t//弹出提示信息\n");
      out.write("\t\t\t\t\t\t\t$.messager.show({ //语法类似于java中的静态方法，直接对象调用\n");
      out.write("\t\t\t\t\t\t\t\ttitle:'错误提示',\n");
      out.write("\t\t\t\t\t\t\t\tmsg:'至少要选择一条记录',\n");
      out.write("\t\t\t\t\t\t\t\ttimeout:2000,\n");
      out.write("\t\t\t\t\t\t\t\tshowType:'slide',\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t}else if(rows.length != 1) {\n");
      out.write("\t\t\t\t\t\t\t//弹出提示信息\n");
      out.write("\t\t\t\t\t\t\t$.messager.show({ //语法类似于java中的静态方法，直接对象调用\n");
      out.write("\t\t\t\t\t\t\t\ttitle:'错误提示',\n");
      out.write("\t\t\t\t\t\t\t\tmsg:'每次只能更新一条记录',\n");
      out.write("\t\t\t\t\t\t\t\ttimeout:2000,\n");
      out.write("\t\t\t\t\t\t\t\tshowType:'slide',\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t} else{\n");
      out.write("\t\t\t\t\t\t\t//1. 弹出更新的页面\n");
      out.write("\t\t\t\t\t\t\tparent.$(\"#win\").window({\n");
      out.write("\t\t\t\t\t\t\t\ttitle:\"添加类别\",\n");
      out.write("\t\t\t\t\t\t\t\twidth:350,\n");
      out.write("\t\t\t\t\t\t\t\theight:250,\n");
      out.write("\t\t\t\t\t\t\t\tcontent:'<iframe src=\"send_category_update.action\" frameborder=\"0\" width=\"100%\" height=\"100%\"/>'\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t//2. \n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t},'-',{\n");
      out.write("\t\t\t\t\ticonCls: 'icon-remove',\n");
      out.write("\t\t\t\t\ttext:'删除类别',\n");
      out.write("\t\t\t\t\thandler: function(){\n");
      out.write("\t\t\t\t\t\t//判断是否有选中行记录，使用getSelections获取选中的所有行\n");
      out.write("\t\t\t\t\t\tvar rows = $(\"#dg\").datagrid(\"getSelections\");\n");
      out.write("\t\t\t\t\t\t//返回被选中的行，如果没有任何行被选中，则返回空数组\n");
      out.write("\t\t\t\t\t\tif(rows.length == 0) {\n");
      out.write("\t\t\t\t\t\t\t//弹出提示信息\n");
      out.write("\t\t\t\t\t\t\t$.messager.show({ //语法类似于java中的静态方法，直接对象调用\n");
      out.write("\t\t\t\t\t\t\t\ttitle:'错误提示',\n");
      out.write("\t\t\t\t\t\t\t\tmsg:'至少要选择一条记录',\n");
      out.write("\t\t\t\t\t\t\t\ttimeout:2000,\n");
      out.write("\t\t\t\t\t\t\t\tshowType:'slide',\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\t//提示是否确认删除，如果确认则执行删除的逻辑\n");
      out.write("\t\t\t\t\t\t\t$.messager.confirm('删除的确认对话框', '您确定要删除此项吗？', function(r){\n");
      out.write("\t\t\t\t\t\t\t\tif (r){\n");
      out.write("\t\t\t\t\t\t\t\t    //1. 从获取的记录中获取相应的的id,拼接id的值，然后发送后台1,2,3,4\n");
      out.write("\t\t\t\t\t\t\t\t    var ids = \"\";\n");
      out.write("\t\t\t\t\t\t\t\t    for(var i = 0; i < rows.length; i ++) {\n");
      out.write("\t\t\t\t\t\t\t\t    \tids += rows[i].id + \",\";\n");
      out.write("\t\t\t\t\t\t\t\t    }\n");
      out.write("\t\t\t\t\t\t\t\t    ids = ids.substr(0, ids.lastIndexOf(\",\"));\n");
      out.write("\t\t\t\t\t\t\t\t    //2. 发送ajax请求\n");
      out.write("\t\t\t\t\t\t\t\t    $.post(\"category/deleteByIds.do\",{ids:ids},function(result){\n");
      out.write("\t\t\t\t\t\t\t\t    \tif(result == \"true\") {\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t//将刚刚选中的记录删除，要不然会影响后面更新的操作\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t$(\"#dg\").datagrid(\"uncheckAll\");\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t//刷新当前页，查询的时候我们用的是load，刷新第一页，reload是刷新当前页\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t$(\"#dg\").datagrid(\"reload\");//不带参数默认为上面的queryParams\t\t\n");
      out.write("\t\t\t\t\t\t\t\t    \t} else {\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t$.messager.show({ \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttitle:'删除异常',\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tmsg:'删除失败，请检查操作',\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttimeout:2000,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tshowType:'slide',\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t    \t}\n");
      out.write("\t\t\t\t\t\t\t\t    },\"text\");\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t}\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t},'-',{ //查询按钮不是LinkButton，它有语法，但是也支持解析HTML标签\n");
      out.write("\t\t\t\t\ttext:\"<input id='ss' name='serach' />\"\n");
      out.write("\t\t\t\t}],\n");
      out.write("\t\t\t    rowStyler: function(index,row){\n");
      out.write("\t\t\t    \tconsole.info(\"index\" + index + \",\" + row)\n");
      out.write("\t\t\t    \tif(index % 2 == 0) {\n");
      out.write("\t\t\t    \t\treturn 'background-color:#fff;';\n");
      out.write("\t\t\t    \t} else {\n");
      out.write("\t\t\t    \t\treturn 'background-color:#c4e1e1;';\n");
      out.write("\t\t\t    \t}\n");
      out.write("\t\t\t    \t\n");
      out.write("\t\t\t    },\n");
      out.write("\t\t\t    //同列属性，但是这些列将会冻结在左侧,大小不会改变，当宽度大于250时，会显示滚动条，但是冻结的列不在滚动条内\n");
      out.write("\t\t\t    frozenColumns:[[\n");
      out.write("\t\t\t        {field:'checkbox',checkbox:true},\n");
      out.write("\t\t\t\t\t{field:'id',title:'编号',width:200}    //这里的field字段要和数据库中的一样，也就是要跟json数据中的一样             \n");
      out.write("\t\t\t    ]],\n");
      out.write("\t\t\t    //配置datagrid的列字段 \n");
      out.write("\t\t\t    //field：列字段的名称，与json的key捆绑\n");
      out.write("\t\t\t    //title：列标题，是显示给人看的\n");
      out.write("\t\t\t    columns:[[    \t\t           \n");
      out.write("\t\t\t        {field:'type',title:'类别名称',width:100, //字段type\n");
      out.write("\t\t\t        \t//用来格式化当前列的值，返回的是最终的数据\n");
      out.write("\t\t\t        \tformatter: function(value,row,index){\n");
      out.write("\t\t\t\t\t\t\treturn \"<span title=\" +　value + \">\" + value + \"</span>\";\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t},    \n");
      out.write("\t\t\t        {field:'hot',title:'热卖',width:100,  //字段hot\n");
      out.write("\t\t\t\t\t\tformatter: function(value,row,index){\n");
      out.write("\t\t\t\t\t\t\tif(value) {\n");
      out.write("\t\t\t\t\t\t\t\treturn \"<input type='checkbox' checked='checked' disabled='true'\";\n");
      out.write("\t\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\t\treturn \"<input type='checkbox' disabled='true'\";\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t/*styler: function(value,row,index){\n");
      out.write("\t\t\t\t\t\t\t//设置当前单元格的样式，返回的字符串直接交给 style属性\n");
      out.write("\t\t\t\t\t\t\tconsole.info(\"val:\" + value + \",row:\" + row + \",index:\" + index)\n");
      out.write("\t\t\t\t\t\t\tif (value < 20){\n");
      out.write("\t\t\t\t\t\t\t\treturn 'color:red;';\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t}*/\t\n");
      out.write("\t\t\t        },\n");
      out.write("\t\t\t        {field:'account.login',title:'所属管理员',width:200, //account.login管理员登录名\n");
      out.write("\t\t\t        \tformatter: function(value,row,index){\n");
      out.write("\t\t\t        \t\t//console.info(row.type + \",\" + row.account.login);\n");
      out.write("\t\t\t        \t\t//return \"x\";\n");
      out.write("\t\t\t        \t\tif(row.account != null && row.account.login != null) {\n");
      out.write("\t\t\t        \t\t\treturn row.account.login; //如果登录名不为空，显示登录名\n");
      out.write("\t\t\t        \t\t} else {\n");
      out.write("\t\t\t        \t\t\treturn \"此类别没有管理员\";\n");
      out.write("\t\t\t        \t\t}\n");
      out.write("\t\t\t\t\t\t\t//return \"<span title=\" +　value + \">\" + value + \"</span>\";\n");
      out.write("\t\t\t\t\t\t}\t\n");
      out.write("\t\t\t        }\n");
      out.write("\t\t\t    ]]    \n");
      out.write("\t\t\t}); \n");
      out.write("\t\t\t//把普通的文本框转化为查询搜索文本框\n");
      out.write("\t\t\t$('#ss').searchbox({ \n");
      out.write("\t\t\t\t//触发查询事件\n");
      out.write("\t\t\t\tsearcher:function(value,name){ //value表示输入的值\n");
      out.write("\t\t\t\t\t//alert(value + \",\" + name)\n");
      out.write("\t\t\t\t\t//获取当前查询的关键字，通过DataGrid加载相应的信息，使用load加载和显示第一页的所有行。\n");
      out.write("\t\t\t\t\t//如果指定了参数，它将取代'queryParams'属性。通常可以通过传递一些参数执行一次查询，通过调用这个方法会向上面url指定的action去发送请求，从服务器加载新数据。\n");
      out.write("\t\t\t\t\t$('#dg').datagrid('load',{\n");
      out.write("\t\t\t\t\t\ttype: value\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t}, \n");
      out.write("\t\t\t\tprompt:'请输入搜索关键字' \n");
      out.write("\t\t\t}); \n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("  <body>\n");
      out.write("  \t<table id=\"dg\"></table>\n");
      out.write("  \t\n");
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
