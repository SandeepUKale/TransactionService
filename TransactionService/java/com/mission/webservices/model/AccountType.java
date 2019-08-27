package com.mission.webservices.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component("accountType")
public class AccountType implements Serializable {

	private static final long serialVersionUID = 2120535793393404223L;
	private int accountTypeId;
	private String accountType;
	private String aacountDetails;

	public AccountType() {
		super();
	}

	public int getAccountTypeId() {
		return accountTypeId;
	}

	public void setAccountTypeId(int accountTypeId) {
		this.accountTypeId = accountTypeId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAacountDetails() {
		return aacountDetails;
	}

	public void setAacountDetails(String aacountDetails) {
		this.aacountDetails = aacountDetails;
	}

	@Override
	public String toString() {
		return "AccountType [accountTypeId=" + accountTypeId + ", accountType=" + accountType + ", aacountDetails="
				+ aacountDetails + "]";
	}
}
