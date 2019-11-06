package com.jinseok.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//
@MapperScan(basePackages ="com.jinseok.blog.mvc")
public class SpringBlogApplication {

	//Spring Boot MainMethod
	public static void main(String[] args) {
		SpringApplication.run(SpringBlogApplication.class, args);
	}

}
