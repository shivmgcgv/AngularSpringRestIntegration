package com.pradeep.banking.service;

import java.util.List;

import com.pradeep.banking.model.Account;

public interface AccountService {

	boolean addAccount(Account account);

	boolean deleteAccount(int accno);

	boolean updateAccount(Account account);

	Account getAccount(int accno);

	List<Account> getAllAccounts();
}
