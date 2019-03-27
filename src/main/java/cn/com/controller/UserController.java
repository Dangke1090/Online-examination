package cn.com.controller;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.com.Entity.Demo;
import cn.com.Entity.ResponseResult;
import cn.com.Entity.User;
import cn.com.service.IUserService;
import cn.com.service.ex.UploadAvatarException;


@Controller 
@RequestMapping("/user")  
public class UserController extends BaseController{  
	@Autowired 
	private IUserService userService;
	@RequestMapping(value="/handlreg.do",method=RequestMethod.POST)
	@ResponseBody
	public ResponseResult<Void> handleReg(
			@RequestParam ("username")String username,
			@RequestParam("name") String name,
			@RequestParam("password")String password,
			@RequestParam("sex")Integer sex,
			@RequestParam("birthday")Integer birthday,
			@RequestParam("birthyear")Integer birthyear,
			@RequestParam("birthmonth")Integer birthmonth,
			@RequestParam("address")String address,
			@RequestParam("idcard")String idcard,
			@RequestParam("education")String education,
			@RequestParam("joinyear")Integer joinyear,
			@RequestParam("joinmonth")Integer joinmonth,
			@RequestParam("joinday")Integer joinday,
			@RequestParam("partyear")Integer partyear,
			@RequestParam("partmonth")Integer partmonth,
			@RequestParam("partday")Integer partday,
			@RequestParam("selprofessional")String selprofessional,
			@RequestParam("seljob")String seljob,
			@RequestParam("idnum")String idnum,
			@RequestParam("selbattalion")String selbattalion,
			@RequestParam("selcommander")String selcommander,
			@RequestParam("selplatoon")String selplatoon,
			@RequestParam("selstate")String selstate,
			@RequestParam("seltype")String seltype,
			@RequestParam("studybackground")String studybackground,
			@RequestParam("rewardpunishment")String rewardpunishment,
			@RequestParam("office")String office,
			HttpServletRequest request,
			@RequestParam(value="image")MultipartFile pictureFile
			) throws Exception
	{
		Integer sort=userService.getMaxSort();
		sort+=1;
		if(!pictureFile.isEmpty()){
			String avatarPath =addImg(request, pictureFile);
		User user = new User(sex, name, username, birthday, birthyear, 
				birthmonth, password, address, idcard, education, joinyear,
				joinmonth, joinday, partyear, partmonth, partday, selprofessional, seljob, idnum, 
				selbattalion, selcommander, selplatoon, selstate,
				seltype,studybackground,rewardpunishment,office,sort,avatarPath);
				user.setImage(avatarPath);
				userService.insert(user);
		}
		return new ResponseResult<Void>();
	}

	@RequestMapping(value="/reg.do",method=RequestMethod.POST)
	@ResponseBody
	public ResponseResult<Void> handReg(
			@RequestParam ("username")String username,
			@RequestParam("name") String name,
			@RequestParam("password")String password,
			@RequestParam("sex")Integer sex,
			@RequestParam("birthday")Integer birthday,
			@RequestParam("birthyear")Integer birthyear,
			@RequestParam("birthmonth")Integer birthmonth,
			@RequestParam("address")String address,
			@RequestParam("idcard")String idcard,
			@RequestParam("education")String education,
			@RequestParam("joinyear")Integer joinyear,
			@RequestParam("joinmonth")Integer joinmonth,
			@RequestParam("joinday")Integer joinday,
			@RequestParam("partyear")Integer partyear,
			@RequestParam("partmonth")Integer partmonth,
			@RequestParam("partday")Integer partday,
			@RequestParam("selprofessional")String selprofessional,
			@RequestParam("seljob")String seljob,
			@RequestParam("idnum")String idnum,
			@RequestParam("selbattalion")String selbattalion,
			@RequestParam("selcommander")String selcommander,
			@RequestParam("selplatoon")String selplatoon,
			@RequestParam("selstate")String selstate,
			@RequestParam("seltype")String seltype,
			@RequestParam("studybackground")String studybackground,
			@RequestParam("rewardpunishment")String rewardpunishment,
			@RequestParam("office")String office,
			HttpServletRequest request,
			@RequestParam(value="image")MultipartFile pictureFile,
			HttpSession session
			) throws Exception
	{	
		Integer sort=userService.getMaxSort();
		sort+=1;
		if(!pictureFile.isEmpty()){
			String avatarPath =addImg(request, pictureFile);
			User user = new User(sex, name, username, birthday, birthyear, 
					birthmonth, password, address, idcard, education, joinyear,
					joinmonth, joinday, partyear, partmonth, partday, selprofessional, seljob, idnum, 
					selbattalion, selcommander, selplatoon, selstate,
					seltype,studybackground,rewardpunishment,office,sort,avatarPath);
				user.setImage(avatarPath);
				Integer pid=getLookFromSession(session);

				user.setId(pid);
				userService.changeInfo(user);
				System.out.println("username"+user.getName());
		}
		return new ResponseResult<Void>();
	}
	
	@RequestMapping(value="/all",method=RequestMethod.POST)
	@ResponseBody
	public ResponseResult<List<User>> byUser(){
		ResponseResult<List<User>> rr = new ResponseResult<List<User>>();
		rr.setData(userService.byname());        	
		return rr ;
	}
	@RequestMapping(value="/professall",method=RequestMethod.POST)
	@ResponseBody
	public ResponseResult<List<User>> byProfessallUser(
			@RequestParam("selprofessional")String selprofessional
			){
		ResponseResult<List<User>> rr = new ResponseResult<List<User>>();
			rr.setData(userService.getProfessinol(selprofessional));   
		return rr ;
	}
	@RequestMapping(value="/joball",method=RequestMethod.POST)
	@ResponseBody
	public ResponseResult<List<User>> byJobUser(
			@RequestParam("seljob")String seljob
			){
		ResponseResult<List<User>> rr = new ResponseResult<List<User>>();
		rr.setData(userService.getJob(seljob));   
		return rr ;
	}
	
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	@ResponseBody
	public ResponseResult<Void>login(
			@RequestParam("username") String username,
			@RequestParam("password")String password,
			HttpSession session){
		User user=userService.login(username, password);
		session.setAttribute("uid", user.getId());
		System.out.println("uid"+user.getId());
		session.setAttribute("username", user.getName());
		System.out.println("uname"+user.getName());
		return new ResponseResult<Void>();
	}
	@RequestMapping(value="/handle_login")
	@ResponseBody
	public ResponseResult<User>byId(HttpSession session){
	Integer id=getUidFromSession(session);
	ResponseResult<User> rr = new ResponseResult<User>();
	rr.setData(userService.getUserById(id));
	return rr;	
	}
	@RequestMapping("/delete.do")
	@ResponseBody
	public ResponseResult<Void> delete(
		@RequestParam("id") Integer id) {
		// 调用业务层对象的deleteById(uid, id)方法
		userService.deleteById(id);
		// 创建返回值对象并返回
		return new ResponseResult<Void>();
	}
	 @RequestMapping(value = "/moveUp")
	    @ResponseBody
	    public ResponseResult<Void> moveUp(Integer id){
	        User user = userService.getUserById(id);
	        if (user==null){
	        	
	        } else {
	            Integer res = userService.moveUp(user);
	            if (res==0){
	                userService.byname();
	            } else {
	            }
	        }
	        return new ResponseResult<Void>();
	    }
	 @RequestMapping(value ="/look")
	    @ResponseBody
	    public ResponseResult<User>getById(@RequestParam("id") Integer id){
		ResponseResult<User> rr = new ResponseResult<User>();
		rr.setData(userService.getUserById(id));
		return rr;
	 }

	 	@RequestMapping(value = "/imgList",method=RequestMethod.POST)
	 	public ResponseResult<User> imgList(@RequestParam("id")Integer id) throws Exception {
	 	User imgList= userService.getImage(id);
	 	ResponseResult<User> rr = new ResponseResult<User>();
	 	rr.setData(imgList);
		return rr;
	}
	 	

		public String addImg(HttpServletRequest request, MultipartFile pictureFile) throws Exception {
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
			return "upload/" + name + "." + ext;
			
	}
		 @RequestMapping(value ="/looking.do",method=RequestMethod.POST)
		    @ResponseBody
		    public ResponseResult<User>getLookById(@RequestParam("id") Integer id,HttpSession session){
			ResponseResult<User> rr = new ResponseResult<User>();
			rr.setData(userService.getUserById(id));
			session.setAttribute("lookid", id);
			
			return rr;
		 }
			
}
