package com.example.crud.crudop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;
import com.mysql.cj.xdevapi.PreparableStatement;

//import com.hm.repository.PatientRepo;

import ch.qos.logback.classic.Logger;
@Component
public class PatientRepo
{    
	
		public static final Boolean deletePatient = null;
		private static Object String  = null;
		private static Logger logger=  (Logger) LoggerFactory.getLogger(PatientRepo.class);
		private static Connection con;
	// 
		//public Boolean deletePatient;
		
		public PatientRepo() throws SQLException
		{
			logger.info("inside patient repo constructor");
			//if (con == null || con.isClosed()) 
			
			    // Re-establish the connection
			   // con = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
			
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management_sys","root","W7301@jqir#");
			
		//	createTable();
		//	 insertnew(patient);
		
				
		}
		public void createTable() throws SQLException 
		{ 
			logger.info("inside createTable method");
		
			String sqlQuery="create table  if not exists patient(id int primary key auto_increment,\r\n"
					+ "                      name varchar(40),\r\n"
					+ "                      age int,\r\n"
					+ "                      doctorName varchar(50))";
			try (Statement stmnt = con.createStatement()) 
			{
		        boolean val = stmnt.execute(sqlQuery);
		        logger.info("Table create query val: " + val);
		    }
		 catch (SQLException e) {
			 
	        logger.error("Error establishing connection or creating table: " + e.getMessage(), e);
	    }
		}
		
		 public static void closeConnection()
		 {
		        try {
		            if (con != null && !con.isClosed()) {
		                con.close();
		                logger.info("Database connection closed");
		            }
		        } catch (SQLException e) {
		            logger.error("Error closing connection: " + e.getMessage(), e);
		        }
		    }
		public void insertnew(Patient patient) throws SQLException
		{
			logger.info("inside insertpatient method");
			String sqlQuerypatient="insert into patient (name,age,doctorName) values(?,?,?)";
			
			try (PreparedStatement ps = con.prepareStatement(sqlQuerypatient)) {
		        ps.setString(1, patient.getName());
		        ps.setInt(2, patient.getAge());
		        ps.setString(3, patient.getDoctorName());
		        int val = ps.executeUpdate();
		        logger.info("patient got inserted with value: " + val);
		    }
			
		}
		public List<Patient>getAllPatient() throws SQLException
		{
			String sqlQuery="select * from patient";
			List<Patient> list=new ArrayList<>();
			Statement stmnt=con.createStatement();
			ResultSet rs=stmnt.executeQuery(sqlQuery);
			while(rs.next())
			{
				int pId=rs.getInt("id");
				String pname=rs.getString("name");
				int age=rs.getInt("age");
				String dName=rs.getString("doctorName");
				Patient patient=new Patient();
				patient.setAge(age);
				patient.setPatientId(pId);
				patient.setName(pname);
				patient.setName(dName);
				
				list.add(patient);
			}
			return list;
			
			
				
			
			//return null;
		}
	
		public Boolean deletePatient(int id) throws SQLException
		{
			String sqlQuery="select * from patient where id="+id;
			Statement stmnt=con.createStatement();
			int  val =stmnt.executeUpdate(sqlQuery);
			logger.info("delete patient id" +id);
			if(val>0)
				return true;
			else
				return false;
			// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			
			// TODO Auto-generated method stub
		
		}
		
		
	}


