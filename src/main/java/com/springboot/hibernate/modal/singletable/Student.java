package com.springboot.hibernate.modal.singletable;

import com.springboot.hibernate.modal.singletable.Person;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@DiscriminatorValue("student")
@Data
public class Student extends Person {
    private String course;

    // Getters and setters
}
