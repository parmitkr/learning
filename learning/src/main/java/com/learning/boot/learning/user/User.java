package com.learning.boot.learning.user;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Id;
import javax.validation.constraints.Size;


@javax.persistence.Entity
public class User {
	@Id
	@Generated(value = { "" })
	private Integer id;
	@Size(min=2)
	private String name;
	private Date dob;
	
	
	
	
	
	public User(Integer id, String name, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	
	
	public Integer getId() {
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
	
	
	

}
