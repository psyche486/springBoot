package com.jinseok.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.jinseok.blog.mvc")
public class MybatisSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisSampleApplication.class, args);
    }
}
