package com.example.crud.crudop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConstructorWayOfDependencyInjection 
{

	@Value("${jdbl.lecture.number}")
	
	String lectureNumber;
	
			
		
	

// @Autowired
    DemoConfig1 democonfig1;
    PatientRepo childClass;
    
	//private ChildClass ChildClass;
    @Autowired
    public ConstructorWayOfDependencyInjection(DemoConfig1  democonfig1,@Value("${jdbl.batch.number}")String batchNumber )
    {
    	this.democonfig1=democonfig1;
		System.out.println("hi there prpety injection is completed"+lectureNumber);
		System.out.println("hi there prpety injection is completed"+ batchNumber);
	}
	 
	
			
    //@Autowired
	public ConstructorWayOfDependencyInjection(DemoConfig1 demo)
	{
		this.democonfig1=demo;
		//System.out.println("inject the dependdency ofConstructorWayOfDependencyInjection ");

	}
	
    @GetMapping("/getDetailsByName1")
	public String exampleBeanScope()
	
	{
		//System.out.println(demoConfig.getConfig());
		//DemoConfig obj =new DemoConfig();
		return "bean scope"+DemoConfig1.getDetails();
	}
}
