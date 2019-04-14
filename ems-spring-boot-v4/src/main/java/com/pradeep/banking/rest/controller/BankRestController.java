package com.pradeep.banking.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pradeep.banking.model.Account;
import com.pradeep.banking.service.AccountService;


@CrossOrigin
@RequestMapping("/accounts")
@RestController
//@Controller
public class BankRestController {

	
	public BankRestController() {
		System.out.println("BankRestController created......");
	}

    @Qualifier("accountServiceRepositoryImpl")//calls  repository service
	@Autowired
	private AccountService accountService;

	
	
/*
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody String getAllAccounts() {
		System.out.println("In rest");
		return accountService.getAllAccounts().toString();
	}
*/	

	@GetMapping
	public List<Account> getAllAccounts() {
		return accountService.getAllAccounts();
	}

	
	
	
	@GetMapping("/{accno}")
	public Account getAccount(@PathVariable("accno") int accno) {
		return accountService.getAccount(accno);
	}

	@DeleteMapping("/{accno}")
	public List<Account> deleteAccount(@PathVariable("accno") int accno) {
		accountService.deleteAccount(accno);
		return accountService.getAllAccounts();

	}

	@PutMapping("/{accno}")
	public List<Account> updateAccount(@PathVariable("accno") int accno, @RequestBody Account account) {

		accountService.updateAccount(account);
		return accountService.getAllAccounts();

	}

	@PostMapping
	public List<Account> addAccount(@RequestBody Account account) {

		accountService.addAccount(account);
		return accountService.getAllAccounts();

	}

}
