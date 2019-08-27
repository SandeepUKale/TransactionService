package com.mission.webservices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mission.webservices.model.Account;
import com.mission.webservices.repository.AccountCRUDRepository;

@Controller
public class AccountController {

	@Autowired
	private AccountCRUDRepository accRepo;
	
	@RequestMapping("home")
	public String home() {
		System.out.println("Ac=countController.home");
		return "Home";
	}

	@RequestMapping("accountDetails")
	public ModelAndView getAccount(@RequestParam("name") String accountName) {
		Account account = accRepo.findByAccountName(accountName);
		System.out.println("AccountController.getAccount()" + account);
		ModelAndView mv = new ModelAndView("ViewAccount");
		mv.addObject("account", account);
		return mv;
	}

	@RequestMapping("addAccount")
	public String addAccount() {
		System.out.println("AccountController.addAccount()");
		return "AddAccount";
	}

	@RequestMapping("saveAccount")
	public ModelAndView saveAccount(Account account) {
		Account accountSaved = accRepo.save(account);
		System.out.println("AccountController.saveAccount()" + accountSaved.getAccountId());
		ModelAndView mv = new ModelAndView("ViewAccount");
		mv.addObject("account", account);
		mv.addObject("message", "Account Saved successfully!");
		return mv;
	}

	@RequestMapping("modifyAccount")
	public String modifyAccount(Account account) {
		System.out.println("AccountController.modifyAccount()");
		return "modifyAccount";
	}

	@RequestMapping("updateAccount")
	public String updateAccount(Account account) {
		Account accountSaved = accRepo.save(account);
		System.out.println("AccountController.updateAccount()");
		return "UpdateAccount";
	}

	@RequestMapping("accounts")
	public String getAllAccounts() {
		System.out.println("AccountController.getAllAccounts()");
		return "AllAccounts";
	}
}
