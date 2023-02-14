package com.chenyi;

import com.chenyi.bean.A;
import com.chenyi.bean.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.chenyi");
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		A a = context.getBean("a", A.class);
		a.b.print();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}
}

