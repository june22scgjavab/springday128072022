package com.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.bean.Movie;


@Configuration
public class ApplicationConfiguration {

	@Bean(name="mybean")
	public Movie getMovie() {
		return new Movie(1,"xuz","John");
	}
}
