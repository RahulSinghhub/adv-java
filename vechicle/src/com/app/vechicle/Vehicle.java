package com.app.vechicle;

import java.time.LocalDate;


public class Vehicle {
	private  String chasisNo;
	private  int Uniq_id;
	private  Color Col;
	private  double price;
	private  LocalDate mfgdate;
	private  LocalDate expdate;
	
	private double pollutionlevel;
	
	public Vehicle(String chasisNo,int Uniq_id,Color Col,double price,LocalDate mfgdate,LocalDate expdate,double pollutionlevel) {
		this.chasisNo=chasisNo;
		this.Uniq_id=Uniq_id;
		this.Col=Col;
		this.price=price;
		this.mfgdate=mfgdate;
		this.expdate=expdate;
		this.pollutionlevel=pollutionlevel;
		
	}
	

}
