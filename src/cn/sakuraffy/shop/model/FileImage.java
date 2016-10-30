package cn.sakuraffy.shop.model;

import java.io.File;

// 实现FileUploadInterceptor的要求
public class FileImage {
	private File file;
	private String contentType;
	private String filename;
	
	public File getFile() {
		return file;
	}
	
	public String getFilename() {
		return filename;
	}

	public String getContentType() {
		return contentType;
	}

	public void setUpload(File file) {
		this.file = file;
	}
	
	public void setUploadContentType(String contentType) {
		this.contentType = contentType;
	}
	
	public void setUploadFileName(String filename) {
		this.filename = filename;
	}
}
