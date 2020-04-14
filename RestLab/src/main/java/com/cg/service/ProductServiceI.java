package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entity.Product;

@Service
public interface ProductServiceI {

	
	public void create(Product s);
	public List reterive();
	public Product findById(int id);
	public void delete(int id);
	
}
