package com.app.core;

import java.time.LocalDate;

public class Employee {
	
	  private int empId;
	  private static int idgen=0;
	  private String Name;
	  private LocalDate joinDate;
	  private int PhoneNumber;
	  private int AadhaarNumber ;
	  
	  public Employee(String name, LocalDate joinDate, int phoneNumber, int aadhaarNumber, double monthlySalary) {
			super();
			this.empId=++idgen;
			Name = name;
			this.joinDate = joinDate;
			PhoneNumber = phoneNumber;
			AadhaarNumber = aadhaarNumber;
			
		}
	  

	  public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public LocalDate getJoinDate() {
			return joinDate;
		}
		public void setJoinDate(LocalDate joinDate) {
			this.joinDate = joinDate;
		}
		public int getPhoneNumber() {
			return PhoneNumber;
		}
		public void setPhoneNumber(int phoneNumber) {
			PhoneNumber = phoneNumber;
		}
		public int getAadhaarNumber() {
			return AadhaarNumber;
		}
		public void setAadhaarNumber(int aadhaarNumber) {
			AadhaarNumber = aadhaarNumber;
		}


		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", Name=" + Name + ", joinDate=" + joinDate + ", PhoneNumber="
					+ PhoneNumber + ", AadhaarNumber=" + AadhaarNumber + "]";
		}
		
		}
