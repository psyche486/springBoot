package com.jinseok.blog.mvc.config;

import com.jinseok.blog.MybatisSampleApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackageClasses = MybatisSampleApplication.class)
public class DataSourceConfig {

}