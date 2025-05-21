package com.product_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product_app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
