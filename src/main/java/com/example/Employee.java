package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	private int empid;	
	private String EmpName;
	private String Email;
	private String Dept;
	private String gender;
	private String status;
	private String dob;
	
	public Employee() {}
	public Employee(int EmpId, String EmpName, String Email, String Dept, String gender, String status, String dob) {
		this.empid = EmpId;
		this.EmpName = EmpName;
		this.Email = Email;
		this.Dept = Dept;
		this.gender = gender;
		this.status = status;
		this.dob = dob;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 public int getEmpId() {
        return empid;
    }
	
	public void setEmpId(int empId) {
		empid =  empId;
	}
	
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
}
