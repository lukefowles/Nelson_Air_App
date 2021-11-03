package com.nelsonairtech.customer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CustomerDAO customerDAO;

    public CustomerService(@Qualifier("Fake") CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }

    public void addCustomers(Customer customer) {
        //Need to add logic to check that the customer already exists
        customerDAO.addCustomers(customer);
    }

    public void updateCustomer(Integer id, Customer customer) {
        customerDAO.updateCustomers(id, customer);
    }

    public void deleteCustomer(Integer id) {
        customerDAO.deleteCustomer(id);
    }
}
