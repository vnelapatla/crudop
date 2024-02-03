package com.hm.controllers;

import java.awt.Paint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hm.model.Patient;
import com.hm.service.PatientService;

@RestController
public class HospitalController 
{
	
	@Autowired
	PatientService ps;
	@PostMapping(value="/Cretepatient")
	public void createPatient(@RequestBody Patient patient)
	
	{
		if(patient!=null)
		{
	ps.createPatient(patient)	;
		}
	}
   @GetMapping(value="/getAllPatientDetails")
   public Patient getPatientDetail(@PathVariable("id") Integer pId)
   {
   
	   ps.getALLPatient();
   return null;
   }
   
   
	
	
}
