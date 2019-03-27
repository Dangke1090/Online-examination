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
import cn.com.Entity.ResponseResult;
import cn.com.service.IJobService;

@Controller
@RequestMapping("/job")
public class JobController {
	@Autowired
	private IJobService jobservice;
	@RequestMapping("/jobname")
	@ResponseBody
	public ResponseResult<Void> jobInsert(
			@RequestParam("jobname")String jobname,Integer id	
			){
		jobservice.delete();
		String src[]=jobname.split("，");
		for(String stemp:src) {
			Job job=new Job(id,stemp);
			jobservice.insert(job);
		}	
		return new ResponseResult<Void>();
	}
	@RequestMapping(value="/all")
	@ResponseBody
	public ResponseResult<List<Job>> getDataes(){
		ResponseResult<List<Job>> rr = new ResponseResult<List<Job>>();
		rr.setData(jobservice.getDataes());
		return rr ;
	}

}
