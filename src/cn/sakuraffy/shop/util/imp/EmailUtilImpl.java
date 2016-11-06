package cn.sakuraffy.shop.util.imp;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Component;

import cn.sakuraffy.shop.model.Order;
import cn.sakuraffy.shop.model.User;
import cn.sakuraffy.shop.util.EmailUtil;

@Component("emailUtil")
public class EmailUtilImpl implements EmailUtil {

	@Override
	public void sendEmail(User user, Order order) {
		Session session = null;
		Message message = null;
		Transport transport = null;
		Properties prop = new Properties();
		
		try {
			prop.setProperty("mail.transport.protocol", "smtp");
			// 创建了session会话
			session = Session.getDefaultInstance(prop);
			//设置debug模式来调试发送信息
			session.setDebug(true);
			
			message = new MimeMessage(session);
			// 主题
			message.setSubject("订单完成");
			// 内容
			message.setContent("尊敬的" + user.getName() + ", 你的订单" +
					order.getId() + " 已经完成 ！","text/html;charset=utf-8");
			// 附件人地址
			message.setFrom(new InternetAddress("shoptest104@126.com"));
			
			transport = session.getTransport();
			//链接邮件服务器的认证信息
			transport.connect("smtp.126.com","shoptest104","shop104");
			// 设置收件人地址，并发送邮件
			transport.sendMessage(message, new InternetAddress[] 
					{ new InternetAddress(user.getEmail()) });
			
		} catch (MessagingException e) {
			throw new RuntimeException();
		} finally {
			try {
				transport.close();
			} catch (MessagingException e) {
				throw new RuntimeException();
			}
		}
	}

}
