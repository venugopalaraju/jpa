package com.springboot.hibernate;

import com.springboot.hibernate.modal.onetomany.Order;
import com.springboot.hibernate.modal.onetomany.Product;
import com.springboot.hibernate.repository.OrderRepository;
import com.springboot.hibernate.repository.ProductRepository;
import com.springboot.hibernate.service.OneToManyService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Date;

@SpringBootApplication
public class OneToManyManyMain {

    public static void main(String[] args) {
        SpringApplication.run(OneToManyManyMain.class, args);

    }

    @Bean
    public CommandLineRunner demo(ProductRepository productRepository, OrderRepository orderRepository) {
        return (args) -> {
            Product product = new Product();
            product.setProductName("product1");
            product.setProductDesc("product desc1");

            Product product2 = new Product();
            product2.setProductName("product2");
            product2.setProductDesc("product desc2");
            /*productRepository.save(product);
            productRepository.save(product2);*/

            Order order =new Order();
            order.setOrderDate(new Date(System.currentTimeMillis()));
            order.getProducts().add(product2);
            order.getProducts().add(product);


            //orderRepository.save(order);

            System.out.println(orderRepository.findAllWithProducts());

        };
    }
}
