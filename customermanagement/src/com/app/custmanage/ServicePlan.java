package com.app.custmanage;

public enum ServicePlan {
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
	private double minPlan;
	 ServicePlan(double minPlan) {
		this.minPlan=minPlan;
	}
	
	 @Override
	 public String toString() {
		 return "minipaln is"+minPlan;
	 }
	 
	public double getMinPlan() {
		return minPlan;
	}
	 
	
	
}
