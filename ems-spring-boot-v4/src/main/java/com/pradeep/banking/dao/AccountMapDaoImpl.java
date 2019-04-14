package com.pradeep.banking.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.pradeep.banking.data.AccountMap;
import com.pradeep.banking.model.Account;

//@Component
@Repository("accountMapDaoImpl")
public class AccountMapDaoImpl implements AccountDao{

	
	public AccountMapDaoImpl() {
    System.out.println("AccountMapDaoImpl created....");
	}
	
	
	@Override
	public boolean addAccount(Account account) {
		AccountMap.INSTANCE.getMap().put(account.getAccno(), account);
		return true;
	}

	@Override
	public boolean deleteAccount(int accno) {
	
		if(AccountMap.INSTANCE.getMap().containsKey(accno))
			{
			AccountMap.INSTANCE.getMap().remove(accno);
			return true;
			}
			
		return false;
	}

	@Override
	public boolean updateAccount(Account account) {
		if(AccountMap.INSTANCE.getMap().containsKey(account.getAccno()))
		{
		AccountMap.INSTANCE.getMap().put(account.getAccno(), account);
		return true;
		}
		
	return false;
	}

	@Override
	public Account getAccount(int accno) {
		
		return AccountMap.INSTANCE.getMap().get(accno);
	}

	@Override
	public List<Account> getAllAccounts() {
				return new ArrayList<>(AccountMap.INSTANCE.getMap().values());
	}

	
	
}
