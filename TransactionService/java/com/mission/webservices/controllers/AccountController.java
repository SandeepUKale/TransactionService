package com.mission.webservices.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mission.webservices.model.Account;

@Controller
public class AccountController {

	@RequestMapping("home")
	public String home() {
		System.out.println("AccountController.home");
		return "Home";
	}

	@RequestMapping("accountDetails")
	public ModelAndView getAccount(@RequestParam("name") String accountName) {
		System.out.println("AccountController.getAccount()" + accountName);
		ModelAndView mv = new ModelAndView("ViewAccount");
		mv.addObject("accName", accountName);
		return mv;
	}

	@RequestMapping("addAccount")
	public String addAccount() {
		System.out.println("AccountController.addAccount()");
		return "AddAccount";
	}

	@RequestMapping("saveAccount")
	public ModelAndView saveAccount(Account account) {
		System.out.println("AccountController.saveAccount()" + account);
		ModelAndView mv = new ModelAndView("ViewAccount");
		mv.addObject("account", account);
		mv.addObject("message", "Account Saved successfully!");
		return mv;
	}

	@RequestMapping("updateAccount")
	public String updateAccount() {
		System.out.println("AccountController.updateAccount()");
		return "UpdateAccount";
	}

	@RequestMapping("accounts")
	public String getAllAccounts() {
		System.out.println("AccountController.getAllAccounts()");
		return "AllAccounts";
	}
}
