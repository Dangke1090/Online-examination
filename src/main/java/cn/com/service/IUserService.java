package cn.com.service;

import java.util.List;

import cn.com.Entity.User;
import cn.com.service.ex.PasswordNotMatchException;
import cn.com.service.ex.UserNotFoundException;


public interface IUserService {
	void insert(User user);
	List<User> byname();
	User login(String username,String password)
			throws UserNotFoundException,PasswordNotMatchException;
	User getUserByUsername(String username);
	void deleteById(Integer id);
	 User getUserById(Integer id);
	 Integer moveUp(User user);
	void update(User user);
	List<User> getProfessinol(String selprofessional);
	List<User> getJob(String seljob);
	Integer getMaxSort();
	User getImage(Integer id);
	void changeInfo(User user);
}
