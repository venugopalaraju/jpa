package com.springboot.hibernate.repository;


import com.springboot.hibernate.modal.onetomany.Product;
import com.springboot.hibernate.modal.onetoone.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
