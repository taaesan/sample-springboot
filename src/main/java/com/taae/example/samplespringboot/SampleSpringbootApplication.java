package com.taae.example.samplespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringbootApplication.class, args);
	}
	
	public String getGreeting(){
		return "Hello";
	}
}
