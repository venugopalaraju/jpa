package com.springboot.hibernate.repository;


import com.springboot.hibernate.modal.onetoone.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
