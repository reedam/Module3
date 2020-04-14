package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.Product;

@Transactional
@Repository
public class ProductDaoImpl implements ProductDaoI {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void create(Product s) {
		em.persist(s); // This object will make a reference database table

	}

	@Override
	public List reterive() {
	Query q = em.createQuery("from Product s");
	return q.getResultList();	
		
	}

	@Override
	public Product findById(int id) {
		return em.find(Product.class, id);
		
	}

	@Override
	public void delete(int id) {
	Product s=em.find(Product.class, id); // this method will find which id to delete
	System.out.println(s.getProduct_id()+""+s.getProduct_name()+""+s.getProduct_price());
	em.remove(s);
	}

	@Override
	public void update(int id) {
		Product stu=em.find(Product.class, id);
		stu.setProduct_name("samsung10");
		System.out.println("updated");
		
	}
	
}
