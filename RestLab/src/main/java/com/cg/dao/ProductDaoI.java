package com.cg.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.entity.Product;


@Repository
public interface ProductDaoI {
	
	public void create(Product s);
	public List reterive();
	public Product findById(int id);
	public void delete(int id);
	public void update(int id);
}
