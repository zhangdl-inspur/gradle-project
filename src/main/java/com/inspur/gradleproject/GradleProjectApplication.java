package com.inspur.gradleproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.inspur"})
@MapperScan(value = {"com.inspur.gradleproject.dao"})
public class GradleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleProjectApplication.class, args);
	}
}
