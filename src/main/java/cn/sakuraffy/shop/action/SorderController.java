package cn.sakuraffy.shop.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sakuraffy.shop.service.SorderService;

@Controller("sorderController")
@RequestMapping("/sorder")
public class SorderController {
	@Resource
	private SorderService sorderService;
	
	@ResponseBody
	@RequestMapping("/querySale")
	public List<Object> querySale(int number) {
		List<Object> list = sorderService.querySale(number);
		return list;
	}
}
