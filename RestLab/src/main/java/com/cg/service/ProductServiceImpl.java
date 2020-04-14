package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ProductDaoI;
import com.cg.entity.Product;

@Service
public class ProductServiceImpl implements ProductServiceI {

	@Autowired
	ProductDaoI Productdao;
	@Override
	public void create(Product s) {
		
		Productdao.create(s);
		
	}

	@Override
	public List reterive() {

		return Productdao.reterive();
	}

	@Override
	public Product findById(int id) {

	return	Productdao.findById(id);
	}

	@Override
	public void delete(int id) {
	
		Productdao.delete(id);
	}
	
	

}
