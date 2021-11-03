package com.nelsonairtech.customer;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CustomerDAO {

    public List<Customer> getCustomers();
    public void addCustomers(Customer customer);
    public void updateCustomers(Integer id, Customer customer);
    public void deleteCustomer(Integer id);

}
