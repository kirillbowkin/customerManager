package com.kirill.customerManager.service;

import com.kirill.customerManager.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface CustomerService {

    Customer getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    Page<Customer> findAll(PageRequest pageRequest);

    List<Customer> findAll();

}
