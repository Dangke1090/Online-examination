package cn.com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.Entity.Job;
import cn.com.Entity.Professional;
import cn.com.Entity.ResponseResult;
import cn.com.service.IJobService;
import cn.com.service.IProfessionalService;

@Controller
@RequestMapping("/professional")
public class ProfessionalController {
	@Autowired
	private IProfessionalService professionalService;
	@RequestMapping("/professionalname")
	@ResponseBody
	public ResponseResult<Void> professionalInsert(
			@RequestParam("professionalname")String professionalname,Integer id	
			){
		professionalService.delete();
		String src[]=professionalname.split("，");
		for(String stemp:src) {
			Professional professional=new Professional(stemp,id);
			professionalService.insert(professional);;
		}	
		return new ResponseResult<Void>();
	}
    @RequestMapping(value="/all")
	@ResponseBody
	public ResponseResult<List<Professional>> getDataes(){
		ResponseResult<List<Professional>> rr = new ResponseResult<List<Professional>>();
		rr.setData(professionalService.getDataes());
		return rr ;
	}

}
