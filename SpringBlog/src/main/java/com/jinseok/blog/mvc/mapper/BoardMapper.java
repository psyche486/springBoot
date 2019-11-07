package com.jinseok.blog.mvc.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.jinseok.blog.mvc.model.BoardVO;

//Mapper interface 생성
@Mapper
public interface BoardMapper {

	public List<Map<String, String>> getList(Map<String, String> param);

	public void insertBoard(BoardVO boardVO);

	public void deleteBoard(BoardVO boardVO);

}
