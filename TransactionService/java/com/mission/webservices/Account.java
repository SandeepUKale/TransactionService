package com.mission.webservices.model;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mission.webservices.model.AccountType;

@Component
@Scope(value="prototype")
public class Account implements Serializable {
	private static final long serialVersionUID = 4814570301161683623L;

	private int account_id;
	private String account_number;
	private String account_name;
	private AccountType account_type;
	private String bank_name;
	private String holder_name;

	public Account() {
		super();
		System.out.println("Account.Account()");
	}

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getHolder_name() {
		return holder_name;
	}

	public void setHolder_name(String holder_name) {
		this.holder_name = holder_name;
	}

	@Override
	public String toString() {
		return "Account [account_number=" + account_number + ", account_name=" + account_name + ", account_type="
				+ account_type + ", bank_name=" + bank_name + ", holder_name=" + holder_name + "]";
	}
}
