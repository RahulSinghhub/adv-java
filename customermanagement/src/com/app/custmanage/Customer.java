package com.app.custmanage;

import java.time.LocalDate;

public class Customer {
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private Double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	private static int idGenerator;
	static {
		idGenerator=100;
	}
	
	public Customer( String firstname,String lastname,String email,	 String password, Double registrationAmount,LocalDate dob,ServicePlan plan, int id) {
		super();
		this.id=++idGenerator;
		this.firstname=firstname;
		this.lastname=lastname;
		this.password=password;
		this.dob=dob;
		this.email=email;
		this.plan=plan;
		this.registrationAmount=registrationAmount;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", registrationAmount=" + registrationAmount + ", dob=" + dob + ", plan="
				+ plan + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		System.out.println("the given equal methods");
		if(o instanceof Customer);
		{
			Customer c = (Customer)o;
		return this.email.equals(c.email);
		}
	}

	public Customer(String email) {
		super();
		this.email = email;
	}
	
	
	
	
	
	
	
	
}

