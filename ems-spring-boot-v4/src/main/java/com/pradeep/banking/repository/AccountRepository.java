package com.pradeep.banking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pradeep.banking.model.Account;

@Repository()
public interface AccountRepository extends JpaRepository<Account, Integer>, AccountCustomRepository,AccountCustomRepository1 {
	public List<Account> findByBalance(double balance);
	@Query("select a from Account a where a.balance between :min and :max")
	List<Account> findByBalanceInBetween(@Param("min") double min, @Param("max") double max);
}
