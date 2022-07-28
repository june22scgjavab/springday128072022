package com.demo.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.bean.Movie;
import com.demo.configuration.ApplicationConfiguration;

public class Tester {

	public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
	//Movie movie=context.getBean(Movie.class);
	//Movie movie=(Movie)context.getBean("getMovie"); // the method name
	Movie movie=(Movie)context.getBean("mybean"); // the bean name
    System.out.println(movie.getId());
    System.out.println(movie.getName());
    System.out.println(movie.getLeadActor());
    
	}

}
