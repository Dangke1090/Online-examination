package cn.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.Entity.User;

public interface UserMapper {
	
	Integer insert(User user);
	List<User> byname();
	User getUserByUsername(String username);
	Integer delete(Integer id);
	User getUserById(@Param("id")Integer id);
	User getLastSort(User user);
	Integer update(User user);
	Integer getMaxSort();
	List<User> getProfessinol(@Param("selprofessional")String selprofessional);
	List<User> getJob(@Param("seljob")String seljob);
	User getImage(@Param("id")Integer id);
	Integer changeInfo(User user);
}
