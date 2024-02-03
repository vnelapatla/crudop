package com.hm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.model.Patient;
import com.hm.repository.PatientRepo;
@Service
public class PatientService 
{
	
	@Autowired
	PatientRepo pr;
public void createPatient(Patient patient)
{    if(patient.getAge()>0)
{
	pr.insert(patient);
}
}
public void getALLPatient() 
{
	// TODO Auto-generated method stub
	
}


}
