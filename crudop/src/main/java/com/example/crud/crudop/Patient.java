package com.example.crud.crudop;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="")
@Entity
public class Patient
{   
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
    long patientId;
    String name;
    int age;
    String doctorName;

	
	//public Patient(long patientId , String name, int age, String doctorName ) {
		//return Patient;
		// TODO Auto-generated constructor stub
	//}


	//public Patient(int pId, String pname, int age2, String dName) {
		// TODO Auto-generated constructor stub
	//}


	public long getPatientId() {
		return patientId;
	}


	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}


	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}


	public String getDoctorName() {
		// TODO Auto-generated method stub
		return doctorName;
	}


		
	}
	
	
    


