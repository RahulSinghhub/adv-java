package com.app.core;

public class PartTimeEMp {
	private double partTime;
	private Employee emp;
	
	
	public PartTimeEMp(double partTime, Employee emp) {
		super();
		this.partTime = partTime;
		this.emp=emp;
	}

	

	public double getPartTime() {
		return partTime;
	}



	public void setPartTime(double partTime) {
		this.partTime = partTime;
	}



	


	@Override
	public String toString() {
		return "PartTimeEMp [partTime=" + partTime + ", emp=" + emp.getEmpId() + "]"+emp;
	}
	
}
