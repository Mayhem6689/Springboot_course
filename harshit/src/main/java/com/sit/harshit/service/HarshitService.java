package com.sit.harshit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HarshitService {
	//get products
	List<String> products = new ArrayList<String>();
	public List<String> getProducts() {
		return this.products;
	}

	// to add product
	public String addProducts(String product) {
		this.products.add(product);
		return "Product added successfully";
	}
	// to remove product
	public String deleteProduct(String product) {
		this.products.remove(product);
		return "Product "+product+" is deleted successfully";
	}
}