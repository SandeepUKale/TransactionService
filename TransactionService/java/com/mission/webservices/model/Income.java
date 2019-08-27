package com.mission.webservices.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Income implements Serializable {

	private static final long serialVersionUID = 2881131492567192879L;

	private long incomeId;
	private String incomeDetails;
	private IncomeHead incomeHead;
	private LocalDate incomeDate;
	private Account incomeAccount;
	private double incomeAmount;
	private String earner;
	private ALIE_TYPE alieType;

	public long getIncomeId() {
		return incomeId;
	}

	public void setIncomeId(long incomeId) {
		this.incomeId = incomeId;
	}

	public String getIncomeDetails() {
		return incomeDetails;
	}

	public void setIncomeDetails(String incomeDetails) {
		this.incomeDetails = incomeDetails;
	}

	public IncomeHead getIncomeHead() {
		return incomeHead;
	}

	public void setIncomeHead(IncomeHead incomeHead) {
		this.incomeHead = incomeHead;
	}

	public LocalDate getIncomeDate() {
		return incomeDate;
	}

	public void setIncomeDate(LocalDate incomeDate) {
		this.incomeDate = incomeDate;
	}

	public Account getIncomeAccount() {
		return incomeAccount;
	}

	public void setIncomeAccount(Account incomeAccount) {
		this.incomeAccount = incomeAccount;
	}

	public double getIncomeAmount() {
		return incomeAmount;
	}

	public void setIncomeAmount(double incomeAmount) {
		this.incomeAmount = incomeAmount;
	}

	public String getEarner() {
		return earner;
	}

	public void setEarner(String earner) {
		this.earner = earner;
	}

	public ALIE_TYPE getAlieType() {
		return alieType;
	}

	public void setAlieType(ALIE_TYPE alieType) {
		this.alieType = alieType;
	}

	@Override
	public String toString() {
		return "Income [incomeId=" + incomeId + ", incomeDetails=" + incomeDetails + ", incomeHead=" + incomeHead
				+ ", incomeDate=" + incomeDate + ", incomeAccount=" + incomeAccount + ", incomeAmount=" + incomeAmount
				+ ", earner=" + earner + ", alieType=" + alieType + "]";
	}
}
