package com.springboot.hibernate.repository;


import com.springboot.hibernate.modal.onetomany.Order;
import com.springboot.hibernate.modal.onetoone.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query("SELECT DISTINCT u FROM Order u LEFT JOIN FETCH u.products")
    List<Order> findAllWithProducts();
}
