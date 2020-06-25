package com.kirill.customerManager.repo;

import com.kirill.customerManager.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
