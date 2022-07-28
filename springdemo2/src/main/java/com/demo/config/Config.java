package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.bean.Hello;

@Configuration
public class Config {

	@Bean
	public Hello hi() {
		return new Hello();
	}
}
