package com.chenyi.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
	@Autowired
	public A a;
	public void print(){
		System.out.println("I am B");
	}
}
