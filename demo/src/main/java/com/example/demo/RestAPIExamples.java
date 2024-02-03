package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // it will ensure that when some body tries to acess the api end point it will serve it
//@RequestMapping("/api")
public class RestAPIExamples
{

	//to create api
	//http method get or put or post 
	//methd - method name 
	@GetMapping(value = "/getNameDetails")// get some data , it will not manipulate the sdata http method
	public String getName()
	{
		return "Name:preethi, Name 2: Navi,Name 3: Ravi,Name 2: pavi";
	}
	@PostMapping(value = "/getNameDetails")// crete new obj and save to db so un safe
	public String postName()
	{
		return "Name:preethi, Name 2: Navi,Name 3: Ravi,Name 2: pavi";
	}
	@PutMapping(value = "/getNameDetails")// to updte full object
	public String putName()
	{
		return "Name:preethi, Name 2: Navi,Name 3: Ravi,Name 2: pavi";
	}
	@PatchMapping(value = "/getNameDetails")// to update partil object
	public String patchName()
	{
		return "Name:preethi, Name 2: Navi,Name 3: Ravi,Name 2: pavi";
	}
}
