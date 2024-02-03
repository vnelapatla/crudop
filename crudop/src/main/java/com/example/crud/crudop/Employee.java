package com.example.crud.crudop;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;


public class Employee 
{
	
private int id;
   @NotNull
   private String name;
   private String designation;
   @Min(18)
   @Max(70)
   private int age;
   @NotNull
   private String gender;
   @Email
   private String email;


   
   public Employee()
   { 
	   
   }
public Employee(int id, String name, String designation, int age, String gender)
{
	super();
	this.id = id;
	this.name = name;
	this.designation = designation;
	this.age = age;
	this.gender = gender;
	this.email=email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
	
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
   
   
   
   
}
