package com.experiment.jenkins.springjenkinstest;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsTestApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringJenkinsTestApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application Started.....>>>>");
		for (int i = 0; i < 10; i++) {
			logger.info("Diary: " + i);
		}
		
	}
	public static void main(String[] args) {
		logger.info("Application Executed....");

		logger.info("Execution 2");
		SpringApplication.run(SpringJenkinsTestApplication.class, args);
	}

}