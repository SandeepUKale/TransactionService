package com.mission.webservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mission.webservices.model.Account;

@SpringBootApplication
public class TransactionApplication {

//	@Autowired
//	private Account account;

	public static void main(String[] args) {
		ConfigurableApplicationContext cac = SpringApplication.run(TransactionApplication.class, args);
		Account account2 = cac.getBean(Account.class);
		System.out.println(account2);

//		System.out.println(account);

		Account account1 = cac.getBean(Account.class);
		System.out.println(account1);
	}
}