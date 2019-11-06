package com.jinseok.blog.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jinseok.blog.mvc.mapper.TimeMapper;

@RestController
public class TimeTestController {
	@Autowired private TimeMapper timeMapper;
	
	@RequestMapping("/getTime")
	public String getTime() {
		return timeMapper.getTime();
}

}
