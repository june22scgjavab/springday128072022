package com.demo.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.bean.Hello;
import com.demo.config.Config;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.add(4, 5));
	
	}

}
