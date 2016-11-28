package cn.sakuraffy.shop.action;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.sakuraffy.shop.model.Product;
import cn.sakuraffy.shop.service.ProductService;

@Controller("productController")
@RequestMapping("/product")
public class ProductController {
	
	@Resource
	private ProductService productService;
	
	@RequestMapping("/save")
	public void save(Product product, @RequestParam("file") 
			CommonsMultipartFile file, HttpServletRequest request) {
		String path = request.getServletContext().getRealPath("/upload");
		product.setPic(upload(file,path));
		product.setDate(new Date());
		productService.save(product);
	}

	@RequestMapping("/update")
	public void update(Product product, @RequestParam("file") 
			CommonsMultipartFile file, HttpServletRequest request) {
		String path = request.getServletContext().getRealPath("/upload");
		product.setPic(upload(file,path));
		product.setDate(new Date());
		productService.update(product);
	}
	
	@ResponseBody
	@RequestMapping("/queryJoinCategory")
	public Map<String,Object> queryJoinCategory(String name, int page, int rows) {
		Map<String,Object> map = new HashMap<>();
		List<Product> products = productService.queryJoinCategory(name, page, rows);
		Long total = productService.total(name);
		map.put("rows", products);
		map.put("total", total);
		return map;
	}
	
	@ResponseBody
	@SuppressWarnings("finally")
	@RequestMapping("/deleteByIds")
	public Boolean deleteByIds(String ids) {
		boolean flag = false;
		try {	
			productService.deleteByIds(ids);
			flag = true;
		}catch (Exception e) {
			throw new RuntimeException();
		}finally {
			return flag;
		}
	}
	
	@RequestMapping("/getById")
	public String getById(int id, ModelMap model) {
		Product product = productService.getById(id);
		model.addAttribute("product", product);
		return "detail";
	}
	
	private String upload(CommonsMultipartFile file , String path) {
		String fileName = file.getOriginalFilename();
		InputStream is = null;
		OutputStream os = null;
		try {
			is = file.getInputStream();
			os = new FileOutputStream(new File(path,fileName));
			int len = 0;
			byte[] buf = new byte[1024];
			while((len = is.read(buf)) != -1) {
				os.write(buf, 0, len);
				os.flush();
			}
			return fileName;
		} catch (IOException e) {
			throw new RuntimeException();
		}finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				throw new RuntimeException();
			}
		}
		
	}
}
