package com.pradeep.banking.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pradeep.banking.model.Account;
import com.pradeep.banking.service.AccountService;


@Controller("bankingApp")
public class BankingSpringController {
	
	public BankingSpringController() {
		System.out.println("BankingSpringController created......");
		}
		
	
	
@Qualifier("accountServiceRepositoryImpl") //calls service ->dao	
@Autowired
private AccountService accountService;

	
@RequestMapping("/saccounts")
public ModelAndView getAllAccounts() {
	System.out.println("In spring..");
	
return new ModelAndView("accountList", "accounts", accountService.getAllAccounts());	
	
}


@RequestMapping("/edit")
public String getAccount(@RequestParam("accno")int accno,ModelMap map) {
	System.out.println("In spring..");
	
	map.addAttribute("account",accountService.getAccount(accno));
	map.addAttribute("accounts",accountService.getAllAccounts());
		
return  "editAccount";	
	
}

@RequestMapping("/new")
public String newAccount(ModelMap map) {
	System.out.println("In spring..");
	
	map.addAttribute("account",new Account());
	map.addAttribute("accounts",accountService.getAllAccounts());
		
return  "addAccount";	
	
}


@RequestMapping("/delete")
public String deleteAccount(@RequestParam("accno")int accno,ModelMap map) {
	System.out.println("In deleteAccount :."+accno);
	
	accountService.deleteAccount(accno);
	
	map.addAttribute("accounts",accountService.getAllAccounts());
		
return  "accountList";	
	
}



@RequestMapping("/update")
public String updateAccount( @ModelAttribute Account account,   ModelMap map) {
	System.out.println("In updateccount "+account);
	
	accountService.updateAccount(account);
	map.addAttribute("accounts",accountService.getAllAccounts());
		
return  "accountList";	
	
}



@RequestMapping("/add")
public String addAccount( @ModelAttribute Account account,   ModelMap map) {
	System.out.println("In addAccount "+account);
	
	accountService.addAccount(account);
	map.addAttribute("accounts",accountService.getAllAccounts());
		
return  "accountList";	
	
}








	

}
