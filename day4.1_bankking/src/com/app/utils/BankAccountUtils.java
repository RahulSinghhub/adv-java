package com.app.utils;

import com.app.banking.BankAccount;
import com.app.custom_exceptions.BankingException;

public class BankAccountUtils {
	
	public static BankAccount accountsumm(int acctno,BankAccount[] accts) throws BankingException {
		BankAccount acct=new BankAccount(acctno);
		for (BankAccount a : accts) {
			if (a != null && a.equals(acct))//if acct = acctno is done we get compiler error we get that variable cannot be resolved to an argument
				return a;
		}
		throw new BankingException("Invalic account number!!!");
	

	}
	}
