package com.app.core;


public class Apple extends Fruit {
	
	boolean fresh=true;
	public Apple(String name, String color, double weight) {
		super(name, color, weight);
		this.fresh=fresh;
	}
	public String taste() {
		return "sweet and sour";
		}
	public void jam() {
		System.out.println(" name: "+getName()+" color "+getColor()+" creating jam");
	}

}
