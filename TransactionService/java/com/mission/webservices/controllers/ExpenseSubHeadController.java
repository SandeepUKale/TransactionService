package com.mission.webservices.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExpenseSubHeadController {

	@RequestMapping("expenseSubHeadDetails")
	public String getExpenseSubHeadDetails() {
		System.out.println("AccountController.getExpenseSubHeadDetails()");
		return "ViewExpenseSubHead";
	}

	@RequestMapping("addExpenseSubHead")
	public String addExpenseSubHead() {
		System.out.println("AccountController.addExpenseSubHead()");
		return "AddExpenseSubHead";
	}

	@RequestMapping("updateExpenseSubHead")
	public String updateExpenseSubHead() {
		System.out.println("AccountController.updateExpenseSubHead()");
		return "UpdateExpenseSubHead";
	}

	@RequestMapping("expenseSubHeads")
	public String getAllExpenseSubHeads() {
		System.out.println("AccountController.getAllExpenseSubHeads()");
		return "AllExpenseSubHeads";
	}
}
