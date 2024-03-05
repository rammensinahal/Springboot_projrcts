package com.example.springboot_product.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springboot_product.dto.Product;
import com.example.springboot_product.repo.ProductRepo;
@Repository
public class ProductDao {
	@Autowired
	private ProductRepo repo;

	public Product saveProduct(Product product) {
		return repo.save(product);
	}
	public Product updatepProduct(int id,Product product) {
		Optional<Product> p=repo.findById(id);
		if(p.isPresent()) {
			product.setId(id);
			return repo.save(product);
		}else {
			return null;
		}
	}
	public Product deleteProduct(int id) {
		Product p=repo.findById(id).get();
		repo.deleteById(id);
		return p;
	}
	public Product getProductById(int id) {
		return repo.findById(id).get();
	}
	public List<Product> getall(){
		return repo.findAll();

	}

}
