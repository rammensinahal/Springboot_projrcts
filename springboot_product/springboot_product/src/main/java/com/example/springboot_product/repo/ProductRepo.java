package com.example.springboot_product.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_product.dto.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
