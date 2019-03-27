package cn.com.service;

import java.io.IOException;
import java.util.List;

import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;

import cn.com.Entity.Demo;
import cn.com.Entity.User;

public interface DemoService {
	void insert(Demo demo);
	List<Demo> byname();
	String save(MultipartFile file, Demo product, ModelMap map) throws IllegalStateException, IOException;
}
