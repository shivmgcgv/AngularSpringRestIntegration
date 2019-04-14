package com.pradeep.banking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pradeep.banking.dao.AccountDao;
import com.pradeep.banking.model.Account;
import com.pradeep.banking.repository.AccountRepository;



@Service("accountServiceRepositoryImpl")
public class AccountServiceRepositoryImpl implements AccountService{

	@Autowired
	private AccountRepository repository;
	
	
	
	public AccountServiceRepositoryImpl() {
		System.out.println("AccountServiceRepositoryImpl default constructor created.....");
	}
	


	@Override
	public boolean addAccount(Account account) {
		// TODO Auto-generated method stub
		return repository.save(account)==account;
	}

	@Override
	public boolean deleteAccount(int accno) {
	
		Account account=repository.findById(accno).get();
		
		if(account!=null) {
			repository.delete(account);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean updateAccount(Account account) {
	Account account1=repository.findById(account.getAccno()).get();
		
		if(account1!=null) {
			repository.save(account);
			return true;
		}
		
		return false;
	}

	@Override
	public Account getAccount(int accno) {
		return repository.findById(accno).get();
	}

	@Override
	public List<Account> getAllAccounts() {
		
	// TODO Auto-generated method stub
	//	repository.withdraw(102, 3000);
	//	repository.deposit(103, 2000);
			
		
		return repository.findAll();
	//return repository.findByBalance(15000);
	//return repository.findByBalanceInBetween(5000,20000);
		
	}

	
	
}
