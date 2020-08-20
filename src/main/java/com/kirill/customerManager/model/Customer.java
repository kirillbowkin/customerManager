package com.kirill.customerManager.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "customers")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "phone_number")
    String phoneNumber;

    @Column(name = "email")
    String email;
}
