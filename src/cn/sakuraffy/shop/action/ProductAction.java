package cn.sakuraffy.shop.action;

import java.io.ByteArrayInputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.sakuraffy.shop.model.FileImage;
import cn.sakuraffy.shop.model.Product;
import cn.sakuraffy.shop.util.FileUpload;

@Controller("productAction")
@Scope("prototype")
public class ProductAction extends BaseAction<Product>{

	private static final long serialVersionUID = -5212792473096920540L;
	
	private FileImage fileImage;
	@Resource
	private FileUpload fileUpload;

	public String queryJoinCategory() {
		jsonMap = new HashMap<String, Object>();
		List<Product> products = productService.queryJoinCategory(model.getName(), page, rows);
		Long total = productService.total(model.getName());
		jsonMap.put("rows", products);
		jsonMap.put("total", total);
		return "jsonMap";
	}
	
	public String deleteByIds() {
		try {
			productService.deleteByIds(ids);
		} catch(Exception e) {
			jsonStream = new ByteArrayInputStream("false".getBytes());
			return "jsonStream";
		}
		jsonStream = new ByteArrayInputStream("true".getBytes());
		return "jsonStream";
	}
	
	public void save() {
		String pic = fileUpload.uploadFile(fileImage);
		
		model.setPic(pic);
		model.setDate(new Date());
		productService.save(model);
	}
	
	public void update() {
		String pic = fileUpload.uploadFile(fileImage);
		model.setPic(pic);
		model.setDate(new Date());
		System.out.println(model);
		productService.update(model);
	}
	
	public final FileImage getFileImage() {
		return fileImage;
	}

	public final void setFileImage(FileImage fileImage) {
		this.fileImage = fileImage;
	}
	
	public String get() {
		request.put("product", productService.getById(model.getId()));
		return "detail";
	}
}
