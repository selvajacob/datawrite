package com.hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Service 
{
	public static void main(String args[]) 
	{
  
		   SpringApplication.run(Datawrite.class, args);
    	   
	} 
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			restTemplate.getForObject("http://localhost:8761/datawriteservice", Datawrite.class);
		};
	}
}
    	   
       
