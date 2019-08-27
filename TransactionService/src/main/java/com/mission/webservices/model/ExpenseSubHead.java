package com.mission.webservices.model;

import java.io.Serializable;

/**
 * @author a502901
 *
 */
public class ExpenseSubHead implements Serializable {

	private static final long serialVersionUID = 8825657456877256932L;

	private int expenseSubHeadId;
	private String expenseSubHeadName;
	private String epenseSubHeadDescription;
	private ALIE_TYPE alieType;

	public int getExpenseSubHeadId() {
		return expenseSubHeadId;
	}

	public void setExpenseSubHeadId(int expenseSubHeadId) {
		this.expenseSubHeadId = expenseSubHeadId;
	}

	public String getExpenseSubHeadName() {
		return expenseSubHeadName;
	}

	public void setExpenseSubHeadName(String expenseSubHeadName) {
		this.expenseSubHeadName = expenseSubHeadName;
	}

	public String getEpenseSubHeadDescription() {
		return epenseSubHeadDescription;
	}

	public void setEpenseSubHeadDescription(String epenseSubHeadDescription) {
		this.epenseSubHeadDescription = epenseSubHeadDescription;
	}

	public ALIE_TYPE getAlieType() {
		return alieType;
	}

	public void setAlieType(ALIE_TYPE alieType) {
		this.alieType = alieType;
	}

	@Override
	public String toString() {
		return "ExpenseSubHead [expenseSubHeadId=" + expenseSubHeadId + ", expenseSubHeadName=" + expenseSubHeadName
				+ ", epenseSubHeadDescription=" + epenseSubHeadDescription + ", alieType=" + alieType + "]";
	}
}
