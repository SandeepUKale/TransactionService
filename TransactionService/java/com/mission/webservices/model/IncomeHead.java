package com.mission.webservices.model;

import java.io.Serializable;

public class IncomeHead implements Serializable {

	private static final long serialVersionUID = 2947591240676643398L;

	private int incomeId;
	private String incomeHeadName;
	private String incomeHeadDescription;

	public int getIncomeId() {
		return incomeId;
	}

	public void setIncomeId(int incomeId) {
		this.incomeId = incomeId;
	}

	public String getIncomeHeadName() {
		return incomeHeadName;
	}

	public void setIncomeHeadName(String incomeHeadName) {
		this.incomeHeadName = incomeHeadName;
	}

	public String getIncomeHeadDescription() {
		return incomeHeadDescription;
	}

	public void setIncomeHeadDescription(String incomeHeadDescription) {
		this.incomeHeadDescription = incomeHeadDescription;
	}

	@Override
	public String toString() {
		return "IncomeHead [incomeId=" + incomeId + ", incomeHeadName=" + incomeHeadName + ", incomeHeadDescription="
				+ incomeHeadDescription + "]";
	}

}
