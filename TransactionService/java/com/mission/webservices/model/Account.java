package com.mission.webservices.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mission.webservices.model.AccountType;

@Component
@Entity
public class Account implements Serializable {
	private static final long serialVersionUID = 4814570301161683623L;

	@Id
	private int accountId;
	private String accountNumber;
	private String accountName;
	private String bankName;
	private String holderName;

	@Autowired
	@Qualifier("accountType")
	private AccountType accountType;

	public Account() {
		super();
		System.out.println("Account.Account()");
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountNumber=" + accountNumber + ", accountName=" + accountName
				+ ", bankName=" + bankName + ", holderName=" + holderName + ", accountType=" + accountType + "]";
	}
}
