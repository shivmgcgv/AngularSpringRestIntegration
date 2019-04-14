package com.pradeep.banking.dao;

import java.util.List;

import com.pradeep.banking.model.Account;

public interface AccountDao {

	boolean addAccount(Account account);

	boolean deleteAccount(int accno);

	boolean updateAccount(Account account);

	Account getAccount(int accno);

	List<Account> getAllAccounts();

}
