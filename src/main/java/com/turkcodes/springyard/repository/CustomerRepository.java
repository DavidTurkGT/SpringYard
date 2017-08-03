package com.turkcodes.springyard.repository;

import com.turkcodes.springyard.model.Customer;

import java.util.List;

/**
 * Created by David Turk on 8/3/17.
 */
public interface CustomerRepository {
    public void addCustomer(Customer customer);
    public List<Customer> getAllCustomers();
    public Customer getCustomerById(int id);
    public void updateCustomer(Customer customer);
    public void deleteCustomer(Customer customer);
}
