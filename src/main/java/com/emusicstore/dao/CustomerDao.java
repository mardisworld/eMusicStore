package com.emusicstore.dao;

import com.emusicstore.model.Customer;

import java.util.List;

/** Created by Marissa on 7/14/17. */

public interface CustomerDao {

    void addCustomer (Customer customer);

    Customer getCustomerById (int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername (String username);

}
