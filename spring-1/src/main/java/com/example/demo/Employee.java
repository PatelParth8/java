package com.example.demo;

import org.springframework.data.annotation.Id;

public class Employee {
	
	@Id
	public String id;
	public String firstname;
	public String lastname;
	
	public Employee(String id, String firstname, String lastname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Override
	public String toString() {
		return "Customer [id = " + id + ", firstname = " + firstname + ", lastname = " + lastname + "]";
	}

}
