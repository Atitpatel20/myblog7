package com.myblog7.myblog7;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Myblog7Application {

	public static void main(String[] args) {
		SpringApplication.run(Myblog7Application.class, args);
	}
	@Bean
	public ModelMapper getModelMapper(){
		return  new ModelMapper();
	}
}
