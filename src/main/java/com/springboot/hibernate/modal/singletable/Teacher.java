package com.springboot.hibernate.modal.singletable;

import com.springboot.hibernate.modal.singletable.Person;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@DiscriminatorValue("teacher")
@Data
public class Teacher extends Person {
    private String subject;

    // Getters and setters
}
