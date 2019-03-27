package cn.com.mapper;



import java.util.List;


import cn.com.Entity.Type;

public interface TypeMapper {
	
	Integer insert(Type type);

	List<Type> getDataes();
	Integer delete();
}
