package cn.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.Entity.User;

import cn.com.mapper.UserMapper;
import cn.com.service.IUserService;
import cn.com.service.ex.PasswordNotMatchException;
import cn.com.service.ex.UpdateDataException;
import cn.com.service.ex.UserNotFoundException;


@Service("userService")
public class USerServiceImpl implements IUserService {
	
	@Autowired
	private UserMapper userMapper;

	public void insert(User user) {
		userMapper.insert(user);
		
	}

	public List<User> byname() {
		return userMapper.byname();
	}

	public User login(String username, String password)
			throws UserNotFoundException,PasswordNotMatchException
			{
			// 鏍规嵁鐢ㄦ埛鍚嶆煡璇㈢敤鎴蜂俊鎭�
			User user = getUserByUsername(username);
			if(user!=null) {
				if (user.getPassword().equals(password)) {	
					System.out.println("password:"+password);
					user.setPassword(null);
					return user;
				} else {
					throw new PasswordNotMatchException(
							"瀵嗙爜閿欒锛�");
				}
				}else{
					throw new UserNotFoundException(
							"灏濊瘯鐧诲綍鐨勭敤鎴峰悕(" + username + ")涓嶅瓨鍦紒");
				}
			}


	public User getUserByUsername(String username) {
		return userMapper.getUserByUsername(username);
	}

	
	public void deleteById(Integer id) {
		userMapper.delete(id);
	}

	
	public User getUserById(Integer id) {
		return userMapper.getUserById(id);
	}

	
	public Integer moveUp(User user) {
		if(user.getSort()>getMaxSort()){
            return 1;
        }
		User last = userMapper.getLastSort(user);
        Integer temp = user.getSort();
        user.setSort(last.getSort());
        last.setSort(temp);
        Integer p = userMapper.update(user);
        System.out.println("p"+p);
        Integer l = userMapper.update(last);
        System.out.println("l"+l);
        if(p>0 && l >0){
            return 0;
        }else {
            return -1;
        }
	}

	public void update(User user) {
		userMapper.update(user);
	}

	
	public List<User> getProfessinol(String professinolname) {
		return userMapper.getProfessinol(professinolname);
	}

	
	public Integer getMaxSort() {
		return userMapper.getMaxSort();
	}

	
	public List<User> getJob(String job) {
		
		return userMapper.getJob(job);
	}

	
	public User getImage(Integer id) {
		
		return userMapper.getImage(id);
	}

	
	public void changeInfo(User user) {
	userMapper.changeInfo(user);
	}





}
