package com.pradeep.banking.model;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pc_accounts")
public class Account {

	@Id
	@Column(name="accno")
	private int accno;
	private String name;
	private double balance;
	private String mobile;
	private String email;
	private String pan;
	private Date doc;
	
	public Account() {
	this.accno=new Random().nextInt(100000);
	}

	public Account(String name, double balance, String mobile, String email, String pan) {
		super();
		this.accno=new Random().nextInt(100000);
		this.name = name;
		this.balance = balance;
		this.mobile = mobile;
		this.email = email;
		this.pan = pan;
		this.doc = new Date();
		
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public Date getDoc() {
		return doc;
	}

	public void setDoc(Date doc) {
		this.doc = doc;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", balance=" + balance + ", mobile=" + mobile + ", email="
				+ email + ", pan=" + pan + ", doc=" + doc + "]";
	}
	
	
	
	
	
}
