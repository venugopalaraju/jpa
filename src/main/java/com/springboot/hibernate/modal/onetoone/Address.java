package com.springboot.hibernate.modal.onetoone;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String  street;
    private String city;
    @OneToOne(mappedBy = "address")
    @JsonIgnore
    private User user;
}
