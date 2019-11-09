package com.jinseok.blog.mvc.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
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
		
		System.out.println("리스트 개수="+ list.size());
		String count = Integer.toString(list.size());
		System.out.println("리스트 개수="+ count);
		
		mav.addObject("list",list);
		mav.addObject("count",count);
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
	public ModelAndView insert(HttpServletRequest request){
		
		BoardVO boardVO = new BoardVO();
		boardVO.setBbs_no(Integer.parseInt(request.getParameter("bbs_no")));
		boardVO.setBbs_title(request.getParameter("bbs_title"));
		boardVO.setBbs_content(request.getParameter("bbs_content"));
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
	 * Board 리스트 삭제
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
	
	/**
	 * Board 리스트 상세보기
	 * @param 
	 * @return ModelAndView
	 */
	@RequestMapping("/board/detail")
	public ModelAndView detail(HttpServletRequest request){		
		int bbs_num = Integer.parseInt(request.getParameter("bbs_no"));
		
		ModelAndView mav = new ModelAndView();
		Map<String,String> result = boardService.detail(bbs_num);
		boardService.increaseCount(bbs_num);
		
		
		mav.addObject("result",result);
		mav.setViewName("/board/detailBoard");
		
		return mav;
	}
	
	/**
	 * Board 리스트 추가
	 * @param 
	 * @return ModelAndView
	 */
	@RequestMapping("/board/update")
	public ModelAndView update(HttpServletRequest request){
		System.out.println("update");
		System.out.println(Integer.parseInt(request.getParameter("bbs_no")));
		BoardVO boardVO = new BoardVO();
		boardVO.setBbs_no(Integer.parseInt(request.getParameter("bbs_no")));
		boardVO.setBbs_title(request.getParameter("bbs_title"));
		boardVO.setBbs_content(request.getParameter("bbs_content"));
		boardVO.setBbs_writer(request.getParameter("bbs_writer"));
 
		boardService.update(boardVO);
		
		ModelAndView mav = new ModelAndView("redirect:/board/boardList");
		
		return mav;
	}	
}
