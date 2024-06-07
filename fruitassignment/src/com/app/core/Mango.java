package com.app.core;

public class Mango extends Fruit{
	
	public Mango(String name, String color, double weight) {
		super(name, color, weight);
		
	}
	public String taste() {
		return "sweet";
		
	}
	public void pulp() {
		System.out.println(" name: "+getName()+" color "+getColor()+" creating pulp");
	}
}
