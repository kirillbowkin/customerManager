package com.kirill.customerManager.service;

import com.kirill.customerManager.model.Customer;
import com.kirill.customerManager.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public Customer getById(Long id) {
        return customerRepo.getOne(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepo.save(customer);
    }

    @Override
    public void delete(Long id) {
        customerRepo.deleteById(id);
    }

    @Override
    public Page<Customer> findAll(PageRequest pageRequest) {
        return customerRepo.findAll(pageRequest);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepo.findAll();
    }
}
