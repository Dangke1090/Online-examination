package cn.com.service;

import java.io.IOException;
import java.util.List;

import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;

import cn.com.Entity.Demo;
import cn.com.Entity.User;

public interface IDemoService {
	/**
	 * 查询所有的图片
	 * @return
	 */
 Integer insert(Demo demo);

}
