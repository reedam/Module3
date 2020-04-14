package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Product;
import com.cg.service.ProductServiceI;

@RestController
public class ProductController {

	@Autowired
	ProductServiceI proservice;
	
@GetMapping(value="/Product")
public List<Product> fetchProduct()
{
	return proservice.reterive();
	
}
	
@GetMapping(value="/Product/{id}")
public Product fetchone(@PathVariable int id)
{
	return proservice.findById(id);
}
	
@PostMapping(value="/Product/new",consumes= {"application/json"})
public String addProduct(@RequestBody Product Product)
{
	proservice.create(Product);
	return "statement added";
}

@DeleteMapping(value="/Product/delete/{id}")
public String deleteProduct(@PathVariable int id)
{
  proservice.delete(id);
	return "Product deleted";
}

}
