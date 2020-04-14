package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.ProductDaoI;
import com.cg.entity.Product;
 

@SpringBootApplication
public class RestLabApplication implements CommandLineRunner {
	
	@Autowired
	ProductDaoI prodao;

	public static void main(String[] args) {
		SpringApplication.run(RestLabApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Product p1 = new Product(1001,"iphone","50000.0");
		Product p2 = new Product(2007,"laptop","200000.0");
		Product p3 = new Product(3002,"samsung galaxy","60000.0");
		Product p4 = new Product(4992,"redmi","87383.0");
		Product p5 = new Product(6003,"ipad","117383.0");
		prodao.create(p1);
		prodao.create(p2);
		prodao.create(p3);
		prodao.create(p4);
		prodao.create(p5);
		System.out.println("record inserted");

		
//		List<Product> studentlist =  prodao.reterive();	
//		for(Product p:studentlist)
//		{
//			System.out.println(p.getProduct_id()+" "+p.getProduct_name()+" "+p.getProduct_price());
//		}
		
	}
}
	



