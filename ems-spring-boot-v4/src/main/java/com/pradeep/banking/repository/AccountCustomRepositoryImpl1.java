package com.pradeep.banking.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class AccountCustomRepositoryImpl1 implements AccountCustomRepository1 {

	@PersistenceContext
	private EntityManager em;

	@Override
	public boolean withdraw(int accno, double amount) {

		Query query = em.createQuery("update Account a set balance=balance-:amount where accno=:accno");

		query.setParameter("accno", accno);
		query.setParameter("amount", amount);

		return query.executeUpdate() == 1;

	}

	@Override
	public boolean deposit(int accno, double amount) {
		Query query = em.createQuery("update Account a set balance=balance+:amount where accno=:accno");

		query.setParameter("accno", accno);
		query.setParameter("amount", amount);

		return query.executeUpdate() == 1;
	}

}
