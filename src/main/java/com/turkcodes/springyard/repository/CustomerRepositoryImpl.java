package com.turkcodes.springyard.repository;

import com.turkcodes.springyard.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by David Turk on 8/3/17.
 */
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final String CREATE_SQL = "INSERT INTO customers (firstname, lastname, phone, email) VALUES (?, ?, ?, ?)";
    @Override
    public void addCustomer(Customer customer) {
        jdbcTemplate.update(CREATE_SQL, customer.getFirstname(), customer.getLastname(), customer.getPhone(),
                customer.getEmail());
    }

    private final String READ_SQL = "SELECT * FROM customers";
    @Override
    public List<Customer> getAllCustomers() {
        return jdbcTemplate.query(READ_SQL,new CustomerMapper());
    }

    private final String READ_ID_SQL = "SELECT * FROM customers WHERE id = ?";
    @Override
    public Customer getCustomerById(int id) {
        System.out.println("Looking for a customer with the id: " + id);
        return jdbcTemplate.queryForObject(READ_ID_SQL, new CustomerMapper(), id);
    }

    private final String UPDATE_SQL = "UPDATE customers SET firstname = ?, lastname = ?, phone = ?, email = ? WHERE " +
            "id = ?";
    @Override
    public void updateCustomer(Customer customer) {
         jdbcTemplate.update(UPDATE_SQL, customer.getFirstname(), customer.getLastname(), customer.getPhone(),
                customer.getEmail(), customer.getId());
    }

    private final String DELETE_SQL = "DELETE FROM customers WHERE id = ?";
    @Override
    public void deleteCustomer(Customer customer) {
        System.out.println("Deleting the user with ID: " + customer.getId());
        jdbcTemplate.update(DELETE_SQL, customer.getId());
    }

    private class CustomerMapper implements RowMapper<Customer>{

        @Override
        public Customer mapRow(ResultSet rs, int i) throws SQLException {
            Customer back = new Customer();
            back.setFirstname(rs.getString("firstname"));
            back.setLastname(rs.getString("lastname"));
            back.setPhone(rs.getString("phone"));
            back.setEmail(rs.getString("email"));
            back.setId(rs.getInt("id"));

            return back;
        }
    }
}
