package cn.com.controller;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import cn.com.Entity.Demo;
import cn.com.Entity.ResponseResult;
import cn.com.service.IDemoService;
@Controller
public class DemoController {  
	@Autowired
	private IDemoService imgService;
	@RequestMapping("/addImg")
	public ResponseResult<Void> addImg(HttpServletRequest request, Demo demo,
			@RequestParam(value="file")MultipartFile pictureFile) throws Exception {
 //这个RequestParam(value="file")的是我们在jsp的name=“file”
		// 使用UUID给图片重命名，并去掉四个“-”
		String name = UUID.randomUUID().toString().replaceAll("-", "");
		// 获取文件的扩展名
		String ext = FilenameUtils.getExtension(pictureFile
				.getOriginalFilename());
		// 设置图片上传路径
		String url = request.getSession().getServletContext()
				.getRealPath("/upload");
		System.out.println(url);
		// 以绝对路径保存重名命后的图片
		pictureFile.transferTo(new File(url + "/" + name + "." + ext));
		// 把图片存储路径保存到数据库
		demo.setPimage("upload/" + name + "." + ext);
		imgService.insert(demo);
		// 重定向到查询所有用户的Controller，测试图片回显
		return new ResponseResult<Void>();
		
} 
}