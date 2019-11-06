package com.jinseok.blog.mvc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jinseok.blog.mvc.service.BoardService;

@Controller
public class BoardController {

	@Autowired BoardService boardService;
	
	/*
	 * 게시판을 
	 */
	@RequestMapping("/board/list")
	public ModelAndView getList(){
		ModelAndView mav = new ModelAndView();
		Map<String,String> param = new HashMap<>();
		
		List<Map<String,String>> list = boardService.getList(param);
		
		mav.addObject("list",list);
		return mav;
	}
}
