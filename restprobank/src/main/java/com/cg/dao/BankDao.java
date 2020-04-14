package com.cg.dao;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.cg.entity.Bank;


@Repository
@Transactional
public class BankDao {

	
	@PersistenceContext
	EntityManager em;
	
//	@PostConstruct
//	public void populateSample() {	
//		bank.add(new Bank("300050601001","Sachin",45025));
//		bank.add(new Bank("300050601002","Rohit",48028));
//		bank.add(new Bank("300050601003","Dhoni",54025));	
//	}
//	public void oldcreate()
//	{
//		for(int i=0;i<3;i++)
//		{
//			em.persist(bank.get(i));
//		}
//	}
	
	@SuppressWarnings("unchecked")
	public List<Bank> reterive()
	{
		Query query=em.createQuery("Select b from Bank b");
		return query.getResultList();	
	}
	
	public Bank getAccount(String accountid) 
	{

//		oldcreate();
		List<Bank> list=reterive();
		Bank b = null;
        Optional<Bank> opt = list.stream()
                                .filter( c -> c.getAccountNumber().equalsIgnoreCase(accountid))
                                .findFirst();
        if(opt.isPresent()) {
            b = opt.get();
        }
        return b;
	}
	
	public String CreateAccount(Bank b)
	{
		em.persist(b);
		return "created";
	}

	public String removeAccount(String accountid) {
		
		em.remove(getAccount(accountid));
		return "removed";
	}

	public String updateBalance(Bank bank) {

		em.merge(bank);
		return "balance updated";
	}
}
