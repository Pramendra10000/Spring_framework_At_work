package com.ps.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")

public class Student {

	@Id  
	@Column  
  private int id;
	@Column 
  private String name;
	@Column 
  private String std;
	@Column 
  private String email;
	@Column 
  private long mobno;
	
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
public String getStd() {
	return std;
}
public void setStd(String std) {
	this.std = std;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobno() {
	return mobno;
}
public void setMobno(long mobno) {
	this.mobno = mobno;
}
 
	
}
