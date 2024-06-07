package com.app.banking;
import java.time.LocalDate;

public class BankAccount {
	private int acctno;
	private  String firstname;
	private String lastname;
	private AcType acttype;
	private LocalDate dob;
	private LocalDate creationDate;
	private double balance;
	
	public BankAccount( int acctno,String firstname,String lastname,AcType acttype,LocalDate dob,LocalDate creationDate, double balance) {
		this.acctno=acctno;
		this.firstname=firstname;
		this.lastname=lastname;
		this.acttype=acttype;
		this.dob=dob;
		this.creationDate=creationDate;
		this.balance=balance;
	}

	@Override
	public String toString() {
		return "BankAccount [acctno=" + acctno + ", firstname=" + firstname + ", lastname=" + lastname + ", acttype="
				+ acttype + ", dob=" + dob + ", creationDate=" + creationDate + ", balance=" + balance + "]";
	}
	
	
	
	
	
	

}
