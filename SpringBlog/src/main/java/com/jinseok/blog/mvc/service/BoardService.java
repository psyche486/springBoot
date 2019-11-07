package com.jinseok.blog.mvc.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinseok.blog.mvc.mapper.BoardMapper;
import com.jinseok.blog.mvc.model.BoardVO;

//import com.jinseok.blog.mvc.mapper.BoardMapper;

@Service
public class BoardService {                  
                                                                  
	@Autowired BoardMapper boardMapper; 
	
	public List<Map<String, String>> getList(Map<String, String> param) {
		
		List<Map<String, String>> list = boardMapper.getList(param);
//		List<Map<String, String>> list = new ArrayList<>();
//		for(int i =0;i< 5 ; i++) {
//			Map<String,String> map = new HashMap<>();
//			map.put("no", String.valueOf(i));
//			map.put("title","123123");
//			map.put("content", i * 100 +"");
//			list.add(map);		
//		}
//		
		return list;
	}

	public void insert(BoardVO boardVO) {
		// TODO Auto-generated method stub
		boardMapper.insertBoard(boardVO);
	}
	
	public void delete(BoardVO boardVO) {
		// TODO Auto-generated method stub
		boardMapper.deleteBoard(boardVO);
	}

}
