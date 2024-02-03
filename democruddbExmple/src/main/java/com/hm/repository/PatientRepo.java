package com.hm.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.hm.model.Patient;

import ch.qos.logback.classic.Logger;
@Component
public class PatientRepo
{
	Logger logger=(Logger) LoggerFactory.getLogger(PatientRepo.class);
	private static Connection con; 
	PatientRepo() throws SQLException
	{
		logger.info("inside patient repo constructor");
		 con =DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management_sys","root","W7301@jqir#");
		createTable();
	}
	public void createTable() throws SQLException 
	{  logger.info("inside createTable method");
	
		String sqlQuery=" create table if not exist patient(id int primary key auto_increment,\r\n"
				+ "                      name varchar(40),\r\n"
				+ "                      age int,\r\n"
				+ "                      doctorName varchar(50))";
		
		Statement stmnt=con.createStatement();
		boolean val =stmnt.execute(sqlQuery);
		logger.info("Table create  query val"+val);

	}
	{
		
	}

public void insert(Patient patient) {
	// TODO Auto-generated method stub
	
}


}
