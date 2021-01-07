package com.sl3v1.devsuperior.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sl3v1.devsuperior.dsdeliver.entities.Product;

public interface OrderRepository extends JpaRepository<Product, Long> {

}
