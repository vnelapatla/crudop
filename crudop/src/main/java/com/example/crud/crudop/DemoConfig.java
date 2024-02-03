package com.example.crud.crudop;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
//@Scope("singleton") this effort is wste single 
@Scope("prototype")
@Configuration("myConfig")
public class DemoConfig 
{
	

	public DemoConfig()
	{
		System.out.println("in demo config constructor");
	}

	public static String getDetails() 
	{
		// TODO Auto-generated method stub
		return "Config:: " +  "this is default config please refactor later";
	}

	

	

}
