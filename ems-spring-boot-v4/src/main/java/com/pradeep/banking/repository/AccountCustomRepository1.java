package com.pradeep.banking.repository;

public interface AccountCustomRepository1  {
	boolean withdraw(int accno, double amount);
	boolean deposit(int accno, double amount);
}
