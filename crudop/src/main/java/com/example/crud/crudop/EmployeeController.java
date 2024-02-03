package com.example.crud.crudop;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
@RestController 
public class EmployeeController 
{
	//api 1 http method post
	
	// create an employee
     //add new employee
	//input :employee details
	//output void or you want to return the emp object that got saved
	
	//api 2 http method get
	
	//api 3 http method put or patch
	
	//api 4 http method delete
	
	 private static int count =1;
	private HashMap<Integer,Employee> empMap = new HashMap<>();
	@PostMapping(value="/createEmployee")
	public void createEmploye(@Valid@RequestBody Employee employee)
	{
		//if(employee.getName()!=null && employee.getAge()>0 && employee.getdesignation!=null )
		{
	 	 employee.setId(count++);
		 
		 empMap.put(employee.getId(), employee);
		} 
	}
	@GetMapping("Employee/get/all")
	public List<Employee>getAllEmployee()
	
	{
		//return  empMap.values().stream().collect(Collectors.toList());
		  return new ArrayList<>(empMap.values());
}
	
//	@PutMapping(value = "Employee/put")// to updte full object
//	public String putName()
//	{
//		return "Name:preethi, Name 2: Navi,Name 3: Ravi,Name 2: pavi";
//	}
	
	 @PutMapping("/updateEmployee")
	    public void updateEmployee(@RequestBody Employee updatedEmployee) {
	        if (empMap.containsKey(updatedEmployee.getId())) {
	            // Check if the employee ID exists in the map
	            empMap.put(updatedEmployee.getId(), updatedEmployee);
	        } else {
	            // Handle the case when the employee ID doesn't exist
	            throw new IllegalArgumentException("Employee with ID " + updatedEmployee.getId() + " not found");
	        }
	    }
	 @DeleteMapping("/deleteEmployee")
	    public void deleteeEmployee(@RequestBody Employee deleteEmployee) {
	        if (empMap.containsKey(deleteEmployee.getId())) {
	            // Check if the employee ID exists in the map
	            empMap.put(deleteEmployee.getId(), deleteEmployee);
	        } else {
	            // Handle the case when the employee ID doesn't exist
	            throw new IllegalArgumentException("Employee with ID " + deleteEmployee.getId() + " not found");
	        }
	    }
}
