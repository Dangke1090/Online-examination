package cn.com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.Entity.Job;
import cn.com.Entity.ResponseResult;
import cn.com.Entity.Situation;
import cn.com.service.ISituationService;

@Controller
@RequestMapping("situation")
public class SituationController {
	    @Autowired
		private ISituationService situationService;
		@RequestMapping(value="handle_state")
		@ResponseBody
		public ResponseResult<Void>insert(@RequestParam("situationname")String situationname,Integer id){
			situationService.delete();
			String src[]=situationname.split("，");
			for(String stemp:src) {
				Situation situation=new Situation(id,stemp);
				situationService.insert(situation);				
		}
			return new ResponseResult<Void>();
}
		@RequestMapping(value="/all")
		@ResponseBody
		public ResponseResult<List<Situation>> getDataes(){
			ResponseResult<List<Situation>> rr = new ResponseResult<List<Situation>>();
			rr.setData(situationService.getDataes());
			return rr ;
		}
}
