package com.springboot.hibernate.modal.onetoone;


import com.springboot.hibernate.modal.onetoone.Address;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @OneToOne
    private Address address;

}
