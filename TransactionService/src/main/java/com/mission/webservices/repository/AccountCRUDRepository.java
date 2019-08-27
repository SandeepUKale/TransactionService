package com.mission.webservices.repository;

import org.springframework.data.repository.CrudRepository;

import com.mission.webservices.model.Account;

public interface AccountCRUDRepository extends CrudRepository<Account, Integer> {

	Account findByAccountName(String accountName);

}
