package com.app.core;

import java.time.LocalDate;

public class Statement {
	private LocalDate TransactionDate;
	private String Narration;
	private double WithdrawalAmount;
	private double DepositAmount;
	public Statement(LocalDate transactionDate, String narration, double withdrawalAmount, double depositAmount) {
		super();
		TransactionDate = transactionDate;
		Narration = narration;
		WithdrawalAmount = withdrawalAmount;
		DepositAmount = depositAmount;
	}
	public LocalDate getTransactionDate() {
		return TransactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		TransactionDate = transactionDate;
	}
	public String getNarration() {
		return Narration;
	}
	public void setNarration(String narration) {
		Narration = narration;
	}
	public double getWithdrawalAmount() {
		return WithdrawalAmount;
	}
	public void setWithdrawalAmount(double withdrawalAmount) {
		WithdrawalAmount = withdrawalAmount;
	}
	public double getDepositAmount() {
		return DepositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		DepositAmount = depositAmount;
	}
	@Override
	public String toString() {
		return "Statement [TransactionDate=" + TransactionDate + ", Narration=" + Narration + ", WithdrawalAmount="
				+ WithdrawalAmount + ", DepositAmount=" + DepositAmount + "]";
	}
	

}
