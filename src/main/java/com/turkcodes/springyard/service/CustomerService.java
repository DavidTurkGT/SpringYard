package com.turkcodes.springyard.service;

import com.turkcodes.springyard.model.Customer;

import java.util.List;

/**
 * Created by David Turk on 8/3/17.
 */
public interface CustomerService {
    public void addCustomer(Customer customer);
    public List<Customer> getAllCustomers();
    public Customer getCustomerById(int id);
    public void updateCustomer(Customer customer);
    public void deleteCustomer(int id);
}
