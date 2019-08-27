package com.mission.webservices.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IncomeController {

	@RequestMapping("incomeDetails")
	public String getIncomeDetails() {
		System.out.println("AccountController.getIncomeDetails()");
		return "ViewIncome";
	}

	@RequestMapping("addIncome")
	public String addIncome() {
		System.out.println("AccountController.addIncome()");
		return "AddIncome";
	}

	@RequestMapping("updateIncome")
	public String updateIncome() {
		System.out.println("AccountController.updateIncome()");
		return "UpdateIncome";
	}

	@RequestMapping("incomes")
	public String getAllIncomes() {
		System.out.println("AccountController.getAllIncomes()");
		return "AllIncomes";
	}
}
