package com.springboot.hibernate.service;

import com.springboot.hibernate.modal.onetomany.Order;
import com.springboot.hibernate.modal.onetomany.Product;
import com.springboot.hibernate.repository.OrderRepository;
import com.springboot.hibernate.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OneToManyService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product){
        return productRepository.save(product);
    }

    public Order save(Order order){
        return orderRepository.save(order);
    }
}
