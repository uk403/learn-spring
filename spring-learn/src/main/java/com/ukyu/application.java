package com.ukyu;

import com.ukyu.bean.User;
import com.ukyu.config.UserConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class application {

	public static void main(String[] args) {
//
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(UserConfig.class);
//		User user = (User) applicationContext.getBean("getUser");
//		System.out.println(user.getName());

		ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
//		User user = (User) classPathXmlApplicationContext.getBean("myTestBean");
//		System.out.println(user.getName());

	}
}
