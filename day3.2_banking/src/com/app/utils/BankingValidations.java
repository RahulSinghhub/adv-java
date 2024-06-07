package com.app.utils;

import java.time.LocalDate;

import com.app.banking.AcType;
import com.app.banking.BankAccount;
import com.app.custom_exceptions.BankingException;
import static com.app.utils.
public class BankingValidations {
	public static final double MIN_BALANCE;
	static {
		MIN_BALANCE = 5000;
	}
public static BankAccount validateInputs(int acctno, String firstName, String lastName ,AcType acType,LocalDate dob,LocalDate creationDate,double balance) {
	AcType type = Actype.valueOf(acType.toUpperCase());//converting parsing the string to enum
	LocalDate bityhDate = Local.parse(dob);
	LocalDate crDate = Loava
	return null;
}
//add public static method to validate for min bal
	public static void validateBalance(double balance) throws BankingException {
		if (balance < MIN_BALANCE)
			throw new BankingException("Insufficient Balance !!!!!");
		System.out.println("valid balance....");
	}
}
