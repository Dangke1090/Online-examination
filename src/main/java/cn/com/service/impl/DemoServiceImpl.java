package cn.com.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;

import cn.com.Entity.Demo;
import cn.com.Entity.User;
import cn.com.mapper.DemoMapper;
import cn.com.mapper.UserMapper;
import cn.com.service.IDemoService;
import cn.com.service.IUserService;

@Service("demoService")
public class DemoServiceImpl implements IDemoService {

	@Autowired
	private DemoMapper demoMapper;


	public Integer insert(Demo demo) {
		
		return demoMapper.insert(demo);
	}

}
