package com.springboot.hibernate.repository;

import com.springboot.hibernate.modal.onetoone.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
