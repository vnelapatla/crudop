package com.example.crud.crudop;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.hm.model.Patient;
//import com.hm.repository.PatientRepo;
@Service
public class PatientService 
{
	
	@Autowired
	PatientRepo pr;
public void createPatient(Patient patient) throws SQLException
{    if(patient.getAge()>0)
{
	pr.insertnew(patient);
}
}

public List<Patient>getAllPatient() throws SQLException 

{
	return pr.getAllPatient();
}

public Boolean deletePatient(int id) throws SQLException {
	// TODO Auto-generated method stub
	return pr.deletePatient(id);
}


}



