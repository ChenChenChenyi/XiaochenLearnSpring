package com.chenyi.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
	@Autowired
	public B b;

	public void print(){
		System.out.println("I am A");
	}
}
