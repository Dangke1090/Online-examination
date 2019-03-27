package cn.com.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.Entity.ResponseResult;
import cn.com.Entity.Type;
import cn.com.service.ITypeService;

@Controller
@RequestMapping("/type")
public class TypeController {
	@Autowired
	private ITypeService typeService;
	@RequestMapping("/typename")
	@ResponseBody
	public ResponseResult<Void> jobInsert(
			@RequestParam("typename")String typename,Integer id	
			){
		typeService.delete();
		String src[]=typename.split("，");
		for(String stemp:src) {
			Type type=new Type(id,stemp);
			typeService.insert(type);
		}	
		return new ResponseResult<Void>();
	}
	@RequestMapping(value="/all")
	@ResponseBody
	public ResponseResult<List<Type>> getDataes(){
		ResponseResult<List<Type>> rr = new ResponseResult<List<Type>>();
		rr.setData(typeService.getDataes());
		return rr ;
	}

}
