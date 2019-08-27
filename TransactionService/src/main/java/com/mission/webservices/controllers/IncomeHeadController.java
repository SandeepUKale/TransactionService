package com.mission.webservices.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IncomeHeadController {

	@RequestMapping("incomeHeadDetails")
	public String getIncomeHeadDetails() {
		System.out.println("AccountController.getIncomeHeadDetails()");
		return "ViewIncomeHead";
	}

	@RequestMapping("addIncomeHead")
	public String addIncomeHead() {
		System.out.println("AccountController.addIncomeHead()");
		return "AddIncomeHead";
	}

	@RequestMapping("updateIncomeHead")
	public String updateIncomeHead() {
		System.out.println("AccountController.updateIncomeHead()");
		return "UpdateIncomeHead";
	}

	@RequestMapping("IncomeHeads")
	public String getAllIncomeHeads() {
		System.out.println("AccountController.getAllIncomeHeads()");
		return "AllIncomeHeads";
	}
}
