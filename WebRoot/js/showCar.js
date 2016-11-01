$(function(){
	//1. 注册事件
	$(".text").change(function() {
		var number = this.value;
		//2. 验证数据的有效性
		if (!isNaN(number) && parseInt(number) == number && number > 0) {
			$(this).attr("lang", number);
			//3. 获取订单项的id 
			var sid = $(this).attr("title");
			$.post("sorder_updateByNumber.action", 
                    {number:number, id:sid},
                    function(total){        
                        $(".total").html(total); //所有商品小计
                }, "text");
			// 更新小计
			// 一定要清楚父子类的关系
			 var price = ($(this).parent().parent().prev().html()*number).toFixed(2);
	         $(this).parent().parent().next().html(price);
		} else {
			this.value = $(this).attr("lang");
		}
	});
});