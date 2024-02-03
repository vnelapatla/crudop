package com.example.demo.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApis
{
//REST -reprsentatinal state transfer
	//rest api-stateless 
	//ui will not store any info
	// if there is no need to maintain state info from one req to another req then we should use REST 
	//soap simple 
	//works with 
	//two diff 
	// node-java script frme wok -no sql
	//spring boot -rdbms 
	
	@GetMapping(value = "/getName333")
	public String postName()
	{
		return "Name:preethi, Name 2: Navi,Name 3: Ravi,Name 2: tavi";
	}
	//@RequestParam
	@GetMapping(value = "/getNameDetails123")
	public String getName123(@RequestParam("name") String name)
	{
		return  name +"test the request paam" + "Name:preethi, Name 2: Navi,Name 3: Ravi,Name 2: tavi";
	}
	//@PathVariable
	@GetMapping(value = "/getNameDetails456/{var}")
	public String getName456(@PathVariable("var")String name)
	{
		return  name +"from  request paam" + "Name:preethi, Name 2: Navi,Name 3: Ravi,Name 2: tavi";
	}
	
	
	
}
