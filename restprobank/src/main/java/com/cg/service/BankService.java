package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.BankDao;
import com.cg.entity.Bank;


@Service
public class BankService {

	@Autowired
	private BankDao bankdao;
	
	public Bank getAccount(String accountid)
	{
		return bankdao.getAccount(accountid);
	}
	
	public String createAccount(Bank bank)
	{
		return bankdao.CreateAccount(bank);
	}

	public String removeAccount(String accountid) {
		return bankdao.removeAccount(accountid);
	}

	public String updateBalance(Bank bank) {
		
		return bankdao.updateBalance(bank);
	}

	
}


