package com.turkcodes.springyard.service;

import com.turkcodes.springyard.model.Customer;
import com.turkcodes.springyard.repository.CustomerRepository;
import com.turkcodes.springyard.repository.CustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by David Turk on 8/3/17.
 */
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Transactional
    @Override
    public void addCustomer(Customer customer) {
        customerRepository.addCustomer(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }
    @Override
    public Customer getCustomerById(int id) {
        return customerRepository.getCustomerById(id);
    }

    @Transactional
    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.updateCustomer(customer);
    }

    @Transactional
    @Override
    public void deleteCustomer(int id) {
        customerRepository.deleteCustomer(id);
    }
}
