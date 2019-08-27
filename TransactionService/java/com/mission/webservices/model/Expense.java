package com.mission.webservices.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Expense implements Serializable {
	private static final long serialVersionUID = 7454373609289252870L;

	private long expenseId;
	private String expenseDetails;
	private ExpenseHead expenseHead;
	private ExpenseSubHead expenseSubHead;
	private LocalDate expenseDate;
	private Account expenseAccount;
	private double expenseAmount;
	private String spender;
	private ALIE_TYPE alieType;

	public long getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(long expenseId) {
		this.expenseId = expenseId;
	}

	public String getExpenseDetails() {
		return expenseDetails;
	}

	public void setExpenseDetails(String expenseDetails) {
		this.expenseDetails = expenseDetails;
	}

	public ExpenseHead getExpenseHead() {
		return expenseHead;
	}

	public void setExpenseHead(ExpenseHead expenseHead) {
		this.expenseHead = expenseHead;
	}

	public ExpenseSubHead getExpenseSubHead() {
		return expenseSubHead;
	}

	public void setExpenseSubHead(ExpenseSubHead expenseSubHead) {
		this.expenseSubHead = expenseSubHead;
	}

	public LocalDate getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(LocalDate expenseDate) {
		this.expenseDate = expenseDate;
	}

	public Account getExpenseAccount() {
		return expenseAccount;
	}

	public void setExpenseAccount(Account expenseAccount) {
		this.expenseAccount = expenseAccount;
	}

	public double getExpenseAmount() {
		return expenseAmount;
	}

	public void setExpenseAmount(double expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

	public String getSpender() {
		return spender;
	}

	public void setSpender(String spender) {
		this.spender = spender;
	}

	public ALIE_TYPE getAlieType() {
		return alieType;
	}

	public void setAlieType(ALIE_TYPE alieType) {
		this.alieType = alieType;
	}

	@Override
	public String toString() {
		return "Expense [expenseId=" + expenseId + ", expenseDetails=" + expenseDetails + ", expenseHead=" + expenseHead
				+ ", expenseSubHead=" + expenseSubHead + ", expenseDate=" + expenseDate + ", expenseAccount="
				+ expenseAccount + ", expenseAmount=" + expenseAmount + ", spender=" + spender + ", alieType="
				+ alieType + "]";
	}
}
