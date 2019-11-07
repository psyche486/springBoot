package com.jinseok.blog.mvc.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jinseok.blog.mvc.model.BoardVO;
import com.jinseok.blog.mvc.service.BoardService;

@Controller
public class BoardController {

	@Autowired BoardService boardService;
	
	/**
	 * Board 리스트 조회 
	 * @param 
	 * @return ModelAndView
	 */
	// /board/list 조회시  
	@RequestMapping("/board/boardList")
	public ModelAndView getList(){
		ModelAndView mav = new ModelAndView();
		Map<String,String> param = new HashMap<>();
		
		List<Map<String,String>> list = boardService.getList(param);
		
		mav.addObject("list",list);
		mav.addObject("jinseok","babo");
		return mav;
	}
	
	/**
	 * Board addBoard.jsp로 이동
	 * @param 
	 * @return ModelAndView
	 */
	@RequestMapping("/board/insertBoard")
	public ModelAndView addboard(Model model){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/board/insertBoard");
		return mav;
	}
	
	/**
	 * Board 리스트 추가
	 * @param 
	 * @return ModelAndView
	 */
	@RequestMapping("/board/insert")
	public ModelAndView insert(HttpServletRequest request) throws UnsupportedEncodingException{
		request.setCharacterEncoding("UTF-8");
		
		BoardVO boardVO = new BoardVO();
		boardVO.setBbs_no(Integer.parseInt(request.getParameter("bbs_no")));
		boardVO.setBbs_title(request.getParameter("bbs_title"));
		boardVO.setBbs_content(request.getParameter("bbs_countent"));
		boardVO.setBbs_read_count(Integer.parseInt(request.getParameter("bbs_read_count")));
		boardVO.setBbs_writer(request.getParameter("bbs_writer"));
 
		boardService.insert(boardVO);
		
		ModelAndView mav = new ModelAndView("redirect:/board/boardList");
		
		return mav;
	}
	
	/**
	 * Board deleteBoard.jsp로 이동
	 * @param 
	 * @return ModelAndView
	 */
	@RequestMapping("/board/deleteBoard")
	public ModelAndView deleteboard(Model model){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/board/deleteBoard");
		return mav;
	}
	
	/**
	 * Board 리스트 추가
	 * @param 
	 * @return ModelAndView
	 */
	@RequestMapping("/board/delete")
	public ModelAndView delete(HttpServletRequest request) throws UnsupportedEncodingException{
		request.setCharacterEncoding("UTF-8");
		
		BoardVO boardVO = new BoardVO();
		boardVO.setBbs_no(Integer.parseInt(request.getParameter("bbs_no")));
 
		boardService.delete(boardVO);
		
		ModelAndView mav = new ModelAndView("redirect:/board/boardList");
		
		return mav;
	}
}
