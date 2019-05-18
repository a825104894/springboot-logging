package com.terry.springbootlog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootLogApplication {
	static Logger logger= LoggerFactory.getLogger(SpringbootLogApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringbootLogApplication.class, args);
		logger.error("yoyoyo");
	}

}
