package com.app.core;

public class FullTimeEmp{
	  private Employee emp;
	 private double monthlySalary;
	public FullTimeEmp(Employee emp, double monthlySalary) {
		super();
		this.emp.getEmpId();
		this.monthlySalary = monthlySalary;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	@Override
	public String toString() {
		return "FullTimeEmp [emp=" + emp + ", monthlySalary=" + monthlySalary + "]";
	} 
}
