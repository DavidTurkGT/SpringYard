package com.turkcodes.springyard.service;

import com.turkcodes.springyard.model.Customer;
import com.turkcodes.springyard.repository.CustomerRepository;
import com.turkcodes.springyard.repository.CustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by David Turk on 8/3/17.
 */
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void addCustomer(Customer customer) {

    }

    @Override
    public List<Customer> getAllCustomers() {
        return null;
    }

    @Override
    public Customer getCustomerById(int id) {
        return null;
    }

    @Override
    public void updateCustomer(Customer customer) {

    }

    @Override
    public void deleteCustomer(int id) {

    }
}
