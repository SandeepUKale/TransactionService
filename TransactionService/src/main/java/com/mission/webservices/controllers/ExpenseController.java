package com.mission.webservices.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExpenseController {

	@RequestMapping("expenseDetails")
	public String getExpenseDetails() {
		System.out.println("AccountController.getExpenseDetails()");
		return "ViewExpense";
	}

	@RequestMapping("addExpense")
	public String addExpense() {
		System.out.println("AccountController.addExpense()");
		return "AddExpense";
	}

	@RequestMapping("updateExpense")
	public String updateExpense() {
		System.out.println("AccountController.updateExpense()");
		return "UpdateExpense";
	}

	@RequestMapping("expenses")
	public String getAllExpenses() {
		System.out.println("AccountController.getAllExpenses()");
		return "AllExpenses";
	}
}
