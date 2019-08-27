package com.mission.webservices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mission.webservices.model.ExpenseHead;
import com.mission.webservices.repository.ExpenseHeadCRUDRepository;

@Controller
public class ExpenseHeadController {

	@Autowired
	private ExpenseHeadCRUDRepository expenseHeadRepo;

	@RequestMapping("expenseHeadDetails")
	public ModelAndView getExpenseHeadDetails(String expenseHeadName) {
		ExpenseHead expenseHead = expenseHeadRepo.findByExpenseHeadName(expenseHeadName);
		System.out.println("AccountController.getExpenseHeadDetails()" + expenseHead);
		ModelAndView mv = new ModelAndView("ViewExpenseHead");
		mv.addObject("expenseHead", expenseHead);
		return mv;
	}

	@PostMapping("saveExpenseHead")
	public ModelAndView saveExpenseHead(ExpenseHead expenseHead) {
		System.out.println("AccountController.saveExpenseHead()");
		ExpenseHead expenseHeadSaved = expenseHeadRepo.save(expenseHead);
		ModelAndView mv = new ModelAndView("AddExpenseHead");
		mv.addObject("expenseHead", expenseHeadSaved);
		return mv;
	}

	@PutMapping("updateExpenseHead")
	public ModelAndView updateExpenseHead(ExpenseHead expenseHead) {
		ExpenseHead expenseHeadUpdated = expenseHeadRepo.save(expenseHead);
		System.out.println("AccountController.updateExpenseHead()");
		ModelAndView mv = new ModelAndView("UpdateExpenseHead");
		mv.addObject("expenseHead", expenseHeadUpdated);
		return mv;
	}

	@GetMapping(path = "expenseHeads", produces = { "application/json", "application/xml" }, consumes = {
			"application/json" })
	public ModelAndView getAllExpenseHeads() {
		System.out.println("AccountController.getAllExpenseHeads()");
		Iterable<ExpenseHead> expenseHeads = expenseHeadRepo.findAll();
		ModelAndView mv = new ModelAndView("AllExpenseHeads");
		mv.addObject("expenseHeads", expenseHeads);
		return mv;
	}
}
