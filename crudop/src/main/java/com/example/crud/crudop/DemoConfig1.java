package com.example.crud.crudop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration("myConfig1")
public class DemoConfig1 
{
@Bean("Bean1")
//@Primary
public RestTemplate getRestTemplte1()
{
	System.out.println("inside get rest templte function");
	return new RestTemplate();
	
}
@Bean("Bean2")
public RestTemplate getRestTemplte2()
{
	System.out.println("inside get rest templte2 function");
	return new RestTemplate();
	
}

public static String getDetails()
{
	return "hi there my name is venktesh";
	
}
}
