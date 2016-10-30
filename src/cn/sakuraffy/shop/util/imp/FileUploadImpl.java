package cn.sakuraffy.shop.util.imp;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import cn.sakuraffy.shop.model.FileImage;
import cn.sakuraffy.shop.util.FileUpload;

@Component("fileUpload")
public class FileUploadImpl implements FileUpload {

	@Value("#{public.filePath}")
	private String filePath;
	
	public String newFileName(FileImage fileImage) {
		String fileExt = FilenameUtils.getExtension(fileImage.getFilename());
		return UUID.randomUUID().toString() + "." + fileExt;
	}
	
	@Override
	public String uploadFile(FileImage fileImage) {
		String pic = newFileName(fileImage);	
		try {
			FileUtils.copyFile(fileImage.getFile(), new File(filePath, pic));
			return pic;
		} catch (IOException e) {
			throw new RuntimeException();
		} 
	}

}
