package cn.com.controller;



import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.Entity.ResponseResult;
import cn.com.service.ex.PasswordNotMatchException;
import cn.com.service.ex.ServiceException;
import cn.com.service.ex.UserNotFoundException;



public abstract class BaseController {

	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public ResponseResult<Void> handleException(Exception e) {
		 if (e instanceof UserNotFoundException) {
			
			return new ResponseResult<Void>(402, e);
		} else if (e instanceof PasswordNotMatchException) {
			
			return new ResponseResult<Void>(403, e);
		}  else {
			
			return new ResponseResult<Void>(600, e);
		}
	}
	
	protected final Integer getUidFromSession(
			HttpSession session) {
		return Integer.valueOf(
			session.getAttribute("uid").toString());
	}
	protected final Integer getLookFromSession(
			HttpSession session) {
		return Integer.valueOf(
			session.getAttribute("lookid").toString());
	}
}









