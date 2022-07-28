package com.demo.bean;

import org.springframework.stereotype.Component;

@Component(value="calculation")
public class Hello {  // hello
public int add(int a,int b)
{
	return a+b;
}
}
