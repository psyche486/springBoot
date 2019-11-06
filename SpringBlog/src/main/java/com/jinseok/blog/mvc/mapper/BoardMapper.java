package com.jinseok.blog.mvc.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

//Mapper interface 생성
@Mapper
public interface BoardMapper {

	public List<Map<String, String>> getList(Map<String, String> param);

}
