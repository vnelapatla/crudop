package com.example.crud.crudop;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;
//dif b/w Rest controller
//controller 

public class DiffRestControllerAndController 
{
	@PostMapping(value="/getDetailsEmployee")
	public void getEmploye(@Valid@RequestBody Employee employee)
	{
		System.out.println("Inside EmployeeController");
		System.out.println("Inside create employee");
	}

}
