package com.jinseok.blog.mvc.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TimeMapper {
	public String getTime();
}
