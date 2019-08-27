package com.mission.webservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mission.webservices.model.ExpenseHead;

public interface ExpenseHeadCRUDRepository extends JpaRepository<ExpenseHead, Integer> {

	ExpenseHead findByExpenseHeadName(String expenseHeadName);

}
