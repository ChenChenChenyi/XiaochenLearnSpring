package com.chenyi;

import com.chenyi.MyBeanFactoryPostProcessor;
import com.chenyi.bean.A;
import com.chenyi.bean.B;
import com.chenyi.bean.Car;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class MyConfig {
	@Bean(value = "car")
	public Car getCar(){
		return new Car("Jack",18);
	}

//	@Bean
//	public BeanFactoryPostProcessor custom1(){
//		return new MyBeanFactoryPostProcessor();
//	}

//	@Bean
//	public A getA(){
//		return new A();
//	}
//
//	@Bean
//	public B getB(){
//		return new B();
//	}
}
