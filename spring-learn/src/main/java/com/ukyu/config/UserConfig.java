package com.ukyu.config;

import com.ukyu.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan
public class UserConfig {

//	@Bean
	public User getUser(){

		return new User("ukyu");
	}
}
