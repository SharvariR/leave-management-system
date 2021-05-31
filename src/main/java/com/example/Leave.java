package com.example.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leaves")
public class Leave {
	
	private int id;
	private int facultyid;	
	private String leavetype;
	private String todate;
	private String fromdate;
	private String description;
	private String status;
	private String adminremark;
	private boolean isread;
	
	public Leave() {}
	public Leave(int facultyid, String leavetype, String fromdate, String todate, String description) {
		this.facultyid = facultyid;
		this.leavetype = leavetype;
		this.fromdate = fromdate;
		this.todate = todate;
		this.description = description;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 public int getId() {
        return id;
    }
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getFacultyid() {
		return facultyid;
	}
	public void setFacultyid(int facultyid) {
		this.facultyid = facultyid;
	}
	public String getLeavetype() {
		return leavetype;
	}
	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}
	public String getTodate() {
		return todate;
	}
	public void setTodate(String todate) {
		this.todate = todate;
	}
	public String getFromdate() {
		return fromdate;
	}
	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAdminremark() {
		return adminremark;
	}
	public void setAdminremark(String adminremark) {
		this.adminremark = adminremark;
	}
	public boolean isIsread() {
		return isread;
	}
	public void setIsread(boolean isread) {
		this.isread = isread;
	}
	
}
