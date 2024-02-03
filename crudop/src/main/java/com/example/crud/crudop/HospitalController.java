package com.example.crud.crudop;

import java.awt.Paint;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.hm.model.Patient;
//import com.hm.service.PatientService;

@RestController
public class HospitalController 
{
	
	@Autowired
	PatientService ps;
	@PostMapping(value="/Cretepatient")
	public void createPatient(@RequestBody Patient patient) throws SQLException
	
	{
		if(patient!=null)
		{
	ps.createPatient(patient)	;
		}
	}
   @GetMapping(value="/getAllpatientDetails")
   public List<Patient> getPatientDetail() throws SQLException
   {
   
   return  ps.getAllPatient();
   }
   
   @DeleteMapping(value="/deletepatient")
   public Boolean delete(@RequestParam("id")int id) throws SQLException
   {
   return  ps.deletePatient(id);
   }
   
   
   
   
	
	
}
