package cn.sakuraffy.shop.util.imp;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.springframework.stereotype.Component;

import cn.sakuraffy.shop.model.Order;
import cn.sakuraffy.shop.model.User;
import cn.sakuraffy.shop.util.MessageUtil;

@Component("messageUtil")
public class MessageUtilImpl implements MessageUtil {

	@Override
	public void sendMessage(User user, Order order) {
		// 1. 打开浏览器
		HttpClient client = new HttpClient();
		// 2. 创建post方法
		PostMethod post = new PostMethod("http://utf8.sms.webchinese.cn/");
		post.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
		// 3. 分别设置uid，密钥，发送号码
		post.setParameter("Uid", "sakuraffy");
		post.setParameter("key", "179cf846561ebf8c07c6");
		post.setParameter("smsMob", user.getPhone());
		post.setParameter("smsText", "尊敬的" + user.getName() + ", 你的订单" +
				order.getId() + " 已经完成 ！");
		// 4. 提交请求并返回状态码
		try {
			int code = client.executeMethod(post);
			System.out.println("http返回的状态码: " + code);
			// 5. 获取服务器端返回的数据信息
			String result = post.getResponseBodyAsString();
			System.out.println(result);
		} catch (Exception e) {
			throw new RuntimeException();
		} finally {
			post.releaseConnection();
		}
	}

}
