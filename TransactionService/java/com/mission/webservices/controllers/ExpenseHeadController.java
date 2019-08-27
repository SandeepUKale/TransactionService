package com.mission.webservices.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExpenseHeadController {

	@RequestMapping("expenseHeadDetails")
	public String getExpenseHeadDetails() {
		System.out.println("AccountController.getExpenseHeadDetails()");
		return "ViewExpenseHead";
	}

	@RequestMapping("addExpenseHead")
	public String addExpenseHead() {
		System.out.println("AccountController.addExpenseHead()");
		return "AddExpenseHead";
	}

	@RequestMapping("updateExpenseHead")
	public String updateExpenseHead() {
		System.out.println("AccountController.updateExpenseHead()");
		return "UpdateExpenseHead";
	}

	@RequestMapping("expenseHeads")
	public String getAllExpenseHeads() {
		System.out.println("AccountController.getAllExpenseHeads()");
		return "AllExpenseHeads";
	}
}
