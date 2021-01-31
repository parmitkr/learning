package com.learning.boot.learning.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class SomeBean {

	private String filedOne;
	private String filedTwo;
	
	@JsonIgnore
	private String filedThree;

	public SomeBean(String filedOne, String filedTwo, String filedThree) {
		super();
		this.filedOne = filedOne;
		this.filedTwo = filedTwo;
		this.filedThree = filedThree;
	}

	public String getFiledOne() {
		return filedOne;
	}

	public void setFiledOne(String filedOne) {
		this.filedOne = filedOne;
	}

	public String getFiledTwo() {
		return filedTwo;
	}

	public void setFiledTwo(String filedTwo) {
		this.filedTwo = filedTwo;
	}

	public String getFiledThree() {
		return filedThree;
	}

	public void setFiledThree(String filedThree) {
		this.filedThree = filedThree;
	}

}
