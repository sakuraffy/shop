<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
<head>  
    <%@ include file="/public/head.jspf" %>  
    
    <script type="text/javascript">  
	    $(function(){  
	        $("a[title]").click(function() {
	        	var text = $(this).text();  
	            var href = $(this).attr("title"); 
	        	//判断当前右边是否已有相应的tab  
	            if($("#tt").tabs("exists", text)) {  
	                $("#tt").tabs("select", text);  
	            } else {  
	                //如果没有则创建一个新的tab，否则切换到当前tag  
	                $("#tt").tabs("add",{  
	                    title:text,  
	                    closable:true,  
	                    content:'<iframe title=' + text + ' src=' + href + ' frameborder="0" width="100%" height="100%" />'
	                    //href:默认通过url地址加载远程的页面，但是仅仅是body部分  
	                    //href:'send_category_query.action'  
	                });  
	            }  
	        });
	    });  
	</script>
</head>  
 	<body class="easyui-layout">  
        <div data-options="region:'north',title:'welcome',split:true" style="height:100px;"></div>     
        <div data-options="region:'west',title:'West',split:true" style="width:200px;">  
            <!-- 此处显示的是系统菜单 -->  
            <div id="menu" class="easyui-accordion" data-options="fit:true">   
    			<div title="基本操作">   
        			<ul>
						<li><a href="#" title="send_category_query.action">类别管理</a>
						<li><a href="#" title="send_product_query.action">商品管理</a>
					</ul>
    			</div>   
    			<div title="销售管理">
    				<ul>
						<li><a href="#" title="send_sale_sale.action">销售管理</a>
					</ul>
    			</div>   
			</div>   
        </div>     
        <div data-options="region:'center',title:'center title'" style="padding:1px;background:#fff;">
        	<div id="tt" class="easyui-tabs" data-options="fit:true">   
			    <div title="系统缺省页面" style="padding:10px">   
			        	系统信息   
			    </div>   
			</div>
        </div> 
        <div id="win" data-options="collapsible:false,minimizable:false,maximizable:false,modal:true"></div>     
    </body>   
  
</html>