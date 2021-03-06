package com.example.eurekasubject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaSubjectApplication {
	

	@Value ("${words}") static String words;
	
	public static void main(String[] args) {
		
		SpringApplication.run(EurekaSubjectApplication.class, args);
		System.out.println("********************* words:" + words);
		
	}
}
