package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
 
@Service
public class ProductService {
	@Autowired
	ProductRepository repository;
	public Product getProductById(int prd_Id) {
		Product prd=repository.findById(prd_Id).get();
		return prd;
	}
	public Iterable<Product> getAllProducts(){
		Iterable<Product> products=repository.findAll();
		return products;
	}
}
 