package com.mission.webservices.model;

import java.io.Serializable;

public class ExpenseHead implements Serializable {

	private static final long serialVersionUID = 2947591240676643398L;

	private int expenseId;
	private String expenseHeadName;
	private String expenseHeadDescription;

	public int getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}

	public String getExpenseHeadDescription() {
		return expenseHeadDescription;
	}

	public void setExpenseHeadDescription(String expenseHeadDescription) {
		this.expenseHeadDescription = expenseHeadDescription;
	}

	public String getExpenseHeadName() {
		return expenseHeadName;
	}

	public void setExpenseHeadName(String expenseHeadName) {
		this.expenseHeadName = expenseHeadName;
	}

	@Override
	public String toString() {
		return "ExpenseHead [expenseId=" + expenseId + ", expenseHeadName=" + expenseHeadName
				+ ", expenseHeadDescription=" + expenseHeadDescription + "]";
	}

}
