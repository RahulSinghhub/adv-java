package com.app.core;

public enum ServPlan {
	SILVER(1000), GOLD(2000), DIAMOND(5000), PLATUNUM(10000);
	
	private double minAmt;
	private ServPlan(double minAmt) {
		this.minAmt = minAmt;
	}
	public double getMinAmt() {
		return minAmt;
	} 
}
