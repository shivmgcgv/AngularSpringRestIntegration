package com.pradeep.banking.repository;

public interface AccountCustomRepository  {
	boolean withdraw(int accno, double amount);
	boolean deposit(int accno, double amount);
}
