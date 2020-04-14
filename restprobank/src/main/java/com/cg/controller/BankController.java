package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Bank;
import com.cg.service.BankService;


@Component
@RestController
@RequestMapping("/bank")
public class BankController {
	
	@Autowired
	BankService bankservice;

	
	
	@RequestMapping(value="/")
	public String posthere()
	{
		return "post.jsp";
	}
	
	@GetMapping(value="/account/{accountid}",produces= {"application/json"})
	public Bank getAccount(@PathVariable String accountid) {
		return bankservice.getAccount(accountid);
		
	}
	
	@PostMapping(value="/account/new",consumes = {"application/json"})                                                                    
	public String createAccount(@RequestBody Bank bank)
	{
		return bankservice.createAccount(bank);
	}
	
	@DeleteMapping("/account/{accountid}")
	public String deleteAccount(@PathVariable String accountid) {
		return bankservice.removeAccount(accountid);
	}
	
	@PutMapping(value="/account/updateBalance",consumes = {"application/json"})                                                                    
	public String updateAccount(@RequestBody Bank bank)
	{
		return bankservice.updateBalance(bank);
	}
	
	
	
	
	
	
	
	
//	@PutMapping(value="/account/updateBalance",consumes = {"application/json"})                                                                    
//	public String updateBalance(@RequestBody Bank bank)
//	{
//		return bankservice.updateBalance(bank);
//	}
}
