package com.example.crud.crudop;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonController
{
	private static Logger logger=LoggerFactory.getLogger(PersonController.class);
	//@Autowired
	//CrudOpExamples obj;
	@Autowired
	DemoConfig demoConfig;
	
	@GetMapping("/getNameDetails")
	public String getNameDetails()
	
	{
		System.out.println("inside get all employee"+this);//return  empMap.values().stream().collect(Collectors.toList());
		  logger.trace("hi there im getting loger details fm loger");
		  logger.debug("hi there im getting loger details fm loger");
		  logger.info("hi there im getting loger details fm loger");
		  logger.warn("hi there im getting loger details fm loger");
		  logger.error("hi there im getting loger details fm loger");
		return "my name is arun";
}
	@GetMapping("/getbeansScopeExample")
	public String exampleBeanScope()
	
	{
		//System.out.println(demoConfig.getConfig());
		//DemoConfig obj =new DemoConfig();
		return "bean scope";
	}
}
