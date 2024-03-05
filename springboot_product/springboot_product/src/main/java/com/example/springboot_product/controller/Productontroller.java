package com.example.springboot_product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_product.dao.ProductDao;
import com.example.springboot_product.dto.Product;
@RestController
public class Productontroller {
	@Autowired
	private ProductDao dao;
	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product) {
		return dao.saveProduct(product);
	}
	@PutMapping("/update")
	public Product updateProduct(@RequestParam int id ,@RequestBody Product product) {
		return dao.updatepProduct(id, product);
	}
	@DeleteMapping("/delete")
	public Product deleteProduct(@RequestParam int id) {
		return dao.deleteProduct(id);
	}
	@GetMapping("/getbyid")
	public Product getproductbyid(@RequestParam int id ) {
		return dao.getProductById(id);	
	}
	@GetMapping("/getall")
	public List<Product> getall() {
		return dao.getall();
	}
}
