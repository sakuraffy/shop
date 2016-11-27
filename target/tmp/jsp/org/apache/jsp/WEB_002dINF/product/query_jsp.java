package org.apache.jsp.WEB_002dINF.product;

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

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
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
      out.write("\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\tbody {\r\n");
      out.write("\t\t\tmargin: 1px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.searchbox {\r\n");
      out.write("\t\t  margin: -3;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\t$('#dg').datagrid({   \r\n");
      out.write("\t\t\t\t//url地址改为请求categoryAction\r\n");
      out.write("\t\t\t    url:'product_queryJoinCategory.action',\r\n");
      out.write("\t\t\t    loadMsg:'Loading......',\r\n");
      out.write("\t\t\t    queryParams:{name:''},//这里不需要传具体的name，因为我们要显示所有的\r\n");
      out.write("\t\t\t    //width:300,\r\n");
      out.write("\t\t\t    fitColumns:true,//水平自动展开，如果设置此属性，则不会有水平滚动条，演示冻结列时，该参数不要设置\r\n");
      out.write("\t\t\t    //显示斑马线\r\n");
      out.write("\t\t\t    striped:true,\r\n");
      out.write("\t\t\t    //当数据多的时候不换行\r\n");
      out.write("\t\t\t    nowrap:true,\r\n");
      out.write("\t\t\t    singleSelect:false, //如果为真，只允许单行显示，全显功能失效\r\n");
      out.write("\t\t\t    //设置分页\r\n");
      out.write("\t\t\t    pagination:true,\r\n");
      out.write("\t\t\t    //设置每页显示的记录数，默认是10个\r\n");
      out.write("\t\t\t\tpageSize:8,\r\n");
      out.write("\t\t\t\t//设置可选的每页记录数，供用户选择，默认是10,20,30,40...\r\n");
      out.write("\t\t\t\tpageList:[5,8,10],\r\n");
      out.write("\t\t\t\tidField:'id',//指定id为标识字段，在删除，更新的时候有用，如果配置此字段，在翻页时，换页不会影响选中的项\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t//toolbar定义添加、删除、更新按钮以及搜索框\r\n");
      out.write("\t\t\t\ttoolbar: [{\r\n");
      out.write("\t\t\t\t\ticonCls: 'icon-add',\r\n");
      out.write("\t\t\t\t\ttext:'添加商品',\r\n");
      out.write("\t\t\t\t\thandler: function(){\r\n");
      out.write("\t\t\t\t\t\tparent.$(\"#win\").window({\r\n");
      out.write("\t\t\t\t\t\t\ttitle:\"添加类别\",\r\n");
      out.write("\t\t\t\t\t\t\twidth:650,\r\n");
      out.write("\t\t\t\t\t\t\theight:600,\r\n");
      out.write("\t\t\t\t\t\t\tcontent:'<iframe src=\"send_product_save.action\" frameborder=\"0\" width=\"100%\" height=\"100%\"/>'\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},'-',{\r\n");
      out.write("\t\t\t\t\ticonCls: 'icon-edit',\r\n");
      out.write("\t\t\t\t\ttext:'更新商品',\r\n");
      out.write("\t\t\t\t\thandler: function(){\r\n");
      out.write("\t\t\t\t\t\t//判断是否有选中行记录，使用getSelections获取选中的所有行\r\n");
      out.write("\t\t\t\t\t\tvar rows = $(\"#dg\").datagrid(\"getSelections\");\r\n");
      out.write("\t\t\t\t\t\tif(rows.length == 0) {\r\n");
      out.write("\t\t\t\t\t\t\t//弹出提示信息\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.show({ //语法类似于java中的静态方法，直接对象调用\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle:'错误提示',\r\n");
      out.write("\t\t\t\t\t\t\t\tmsg:'至少要选择一条记录',\r\n");
      out.write("\t\t\t\t\t\t\t\ttimeout:2000,\r\n");
      out.write("\t\t\t\t\t\t\t\tshowType:'slide',\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t}else if(rows.length != 1) {\r\n");
      out.write("\t\t\t\t\t\t\t//弹出提示信息\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.show({ //语法类似于java中的静态方法，直接对象调用\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle:'错误提示',\r\n");
      out.write("\t\t\t\t\t\t\t\tmsg:'每次只能更新一条记录',\r\n");
      out.write("\t\t\t\t\t\t\t\ttimeout:2000,\r\n");
      out.write("\t\t\t\t\t\t\t\tshowType:'slide',\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t} else{\r\n");
      out.write("\t\t\t\t\t\t\t//1. 弹出更新的页面\r\n");
      out.write("\t\t\t\t\t\t\tparent.$(\"#win\").window({\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle:\"更新商品\",\r\n");
      out.write("\t\t\t\t\t\t\t\twidth:650,\r\n");
      out.write("\t\t\t\t\t\t\t\theight:600,\r\n");
      out.write("\t\t\t\t\t\t\t\tcontent:'<iframe src=\"send_product_update.action\" frameborder=\"0\" width=\"100%\" height=\"100%\"/>'\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},'-',{\r\n");
      out.write("\t\t\t\t\ticonCls: 'icon-remove',\r\n");
      out.write("\t\t\t\t\ttext:'删除商品',\r\n");
      out.write("\t\t\t\t\thandler: function(){\r\n");
      out.write("\t\t\t\t\t\t//判断是否有选中行记录，使用getSelections获取选中的所有行\r\n");
      out.write("\t\t\t\t\t\tvar rows = $(\"#dg\").datagrid(\"getSelections\");\r\n");
      out.write("\t\t\t\t\t\t//返回被选中的行，如果没有任何行被选中，则返回空数组\r\n");
      out.write("\t\t\t\t\t\tif(rows.length == 0) {\r\n");
      out.write("\t\t\t\t\t\t\t//弹出提示信息\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.show({ //语法类似于java中的静态方法，直接对象调用\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle:'错误提示',\r\n");
      out.write("\t\t\t\t\t\t\t\tmsg:'至少要选择一条记录',\r\n");
      out.write("\t\t\t\t\t\t\t\ttimeout:2000,\r\n");
      out.write("\t\t\t\t\t\t\t\tshowType:'slide',\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t//提示是否确认删除，如果确认则执行删除的逻辑\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.confirm('删除的确认对话框', '您确定要删除此项吗？', function(r){\r\n");
      out.write("\t\t\t\t\t\t\t\tif (r){\r\n");
      out.write("\t\t\t\t\t\t\t\t    //1. 从获取的记录中获取相应的的id,拼接id的值，然后发送后台1,2,3,4\r\n");
      out.write("\t\t\t\t\t\t\t\t    var ids = \"\";\r\n");
      out.write("\t\t\t\t\t\t\t\t    for(var i = 0; i < rows.length; i ++) {\r\n");
      out.write("\t\t\t\t\t\t\t\t    \tids += rows[i].id + \",\";\r\n");
      out.write("\t\t\t\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t\t\t\t    ids = ids.substr(0, ids.lastIndexOf(\",\"));\r\n");
      out.write("\t\t\t\t\t\t\t\t    //2. 发送ajax请求\r\n");
      out.write("\t\t\t\t\t\t\t\t    $.post(\"product_deleteByIds.action\",{ids:ids},function(result){\r\n");
      out.write("\t\t\t\t\t\t\t\t    \tif(result == \"true\") {\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t//将刚刚选中的记录删除，要不然会影响后面更新的操作\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t$(\"#dg\").datagrid(\"uncheckAll\");\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t//刷新当前页，查询的时候我们用的是load，刷新第一页，reload是刷新当前页\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t$(\"#dg\").datagrid(\"reload\");//不带参数默认为上面的queryParams\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t$.messager.show({ \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttitle:'删除异常',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tmsg:'删除失败，请检查操作',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttimeout:2000,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tshowType:'slide',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t}\r\n");
      out.write("\t\t\t\t\t\t\t\t    },\"text\");\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t}\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},'-',{ //查询按钮不是LinkButton，它有语法，但是也支持解析HTML标签\r\n");
      out.write("\t\t\t\t\ttext:\"<input id='ss' name='serach' />\"\r\n");
      out.write("\t\t\t\t}],\r\n");
      out.write("\t\t\t    rowStyler: function(index,row){\r\n");
      out.write("\t\t\t    \tconsole.info(\"index\" + index + \",\" + row)\r\n");
      out.write("\t\t\t    \tif(index % 2 == 0) {\r\n");
      out.write("\t\t\t    \t\treturn 'background-color:#fff;';\r\n");
      out.write("\t\t\t    \t} else {\r\n");
      out.write("\t\t\t    \t\treturn 'background-color:#c4e1e1;';\r\n");
      out.write("\t\t\t    \t}\r\n");
      out.write("\t\t\t    \t\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    frozenColumns:[[\r\n");
      out.write("\t\t\t        {field:'checkbox',checkbox:true},\r\n");
      out.write("\t\t\t\t\t{field:'id',title:'商品编号',width:100}   \r\n");
      out.write("\t\t\t    ]],\r\n");
      out.write("\t\t\t    columns:[[    \t\t           \r\n");
      out.write("\t\t\t        {field:'name',title:'商品名称',width:100},    \r\n");
      out.write("\t\t\t        {field:'price',title:'商品价格',width:100},\r\n");
      out.write("\t\t\t        {field:'remark',title:'简单描述',width:100},\r\n");
      out.write("\t\t\t        {field:'xremark',title:'详细描述',width:100},\r\n");
      out.write("\t\t\t        {field:'date',title:'上架时间',width:100},\r\n");
      out.write("\t\t\t        {field:'commend',title:'推荐商品',width:100,  \r\n");
      out.write("\t\t\t\t\t\tformatter: function(value,row,index){\r\n");
      out.write("\t\t\t\t\t\t\tif(value) {\r\n");
      out.write("\t\t\t\t\t\t\t\treturn \"<input type='checkbox' checked='checked' disabled='true'\";\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\treturn \"<input type='checkbox' disabled='true'\";\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t        },\r\n");
      out.write("\t\t\t        {field:'open',title:'有效商品',width:100,  //字段hot\r\n");
      out.write("\t\t\t\t\t\tformatter: function(value,row,index){\r\n");
      out.write("\t\t\t\t\t\t\tif(value) {\r\n");
      out.write("\t\t\t\t\t\t\t\treturn \"<input type='checkbox' checked='checked' disabled='true'\";\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\treturn \"<input type='checkbox' disabled='true'\";\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t        },\r\n");
      out.write("\t\t\t        {field:'category.type',title:'所属商品类别',width:200, //category.type是商品类别\r\n");
      out.write("\t\t\t        \tformatter: function(value,row,index){\r\n");
      out.write("\t\t\t        \t\tif(row.category != null && row.category.type != null) {\r\n");
      out.write("\t\t\t        \t\t\treturn row.category.type; //如果商品类别不为空，返回商品类别\r\n");
      out.write("\t\t\t        \t\t} else {\r\n");
      out.write("\t\t\t        \t\t\treturn \"此商品暂时未分类\";\r\n");
      out.write("\t\t\t        \t\t}\r\n");
      out.write("\t\t\t\t\t\t}\t\r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t    ]]    \r\n");
      out.write("\t\t\t}); \r\n");
      out.write("\t\t\t//把普通的文本框转化为查询搜索文本框\r\n");
      out.write("\t\t\t$('#ss').searchbox({ \r\n");
      out.write("\t\t\t\t//触发查询事件\r\n");
      out.write("\t\t\t\tsearcher:function(value,name){ //value表示输入的值\r\n");
      out.write("\t\t\t\t\t//alert(value + \",\" + name)\r\n");
      out.write("\t\t\t\t\t//获取当前查询的关键字，通过DataGrid加载相应的信息，使用load加载和显示第一页的所有行。\r\n");
      out.write("\t\t\t\t\t//如果指定了参数，它将取代'queryParams'属性。通常可以通过传递一些参数执行一次查询，通过调用这个方法会向上面url指定的action去发送请求，从服务器加载新数据。\r\n");
      out.write("\t\t\t\t\t$('#dg').datagrid('load',{\r\n");
      out.write("\t\t\t\t\t\tname: value\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t}, \r\n");
      out.write("\t\t\t\tprompt:'请输入搜索关键字' \r\n");
      out.write("\t\t\t}); \r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  \t<table id=\"dg\"></table>\r\n");
      out.write("  \t\r\n");
      out.write("  </body>\r\n");
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
