package com.app.core;
import java.time.LocalDate;


public class Customer {
	private int customId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double regAmt;
	private LocalDate dob;
	private ServPlan plan;
	private static int idAdd;
	public Customer(String firstName, String lastName, String email, String password, double regAmt,
			LocalDate dob, ServPlan plan) {
		super();
		this.customId = ++idAdd;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.regAmt = regAmt;
		this.dob = dob;
		this.plan = plan;
		
	}
	@Override
	public String toString() {
		return "Customer [customId=" + customId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", password=" + password + ", regAmt=" + regAmt + ", dob=" + dob + ", plan=" + plan + "]";
	}
	public int getCustomId() {
		return customId;
	}
	public void setCustomId(int customId) {
		this.customId = customId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getRegAmt() {
		return regAmt;
	}
	public void setRegAmt(double regAmt) {
		this.regAmt = regAmt;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public ServPlan getPlan() {
		return plan;
	}
	public void setPlan(ServPlan plan) {
		this.plan = plan;
	}
	
	//taking out the equals method because we h
	
	public Customer(String email) {
		this.email=email;
	}
	
	
	
	
	
	
	

}
