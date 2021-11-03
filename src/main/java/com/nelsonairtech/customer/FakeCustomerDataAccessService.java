package com.nelsonairtech.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository("Fake")
public class FakeCustomerDataAccessService implements CustomerDAO{

    private List<Customer> db = new ArrayList<>();

    public FakeCustomerDataAccessService() {
        db.add(new Customer(1, "Ollie", "100", "123", "Oli@snailmail.oom"));
        db.add(new Customer(2, "Luke", "101", "124", "luke@cheetahmail.com"));
    }

    @Override
    public List<Customer> getCustomers() {
        return db;
    }

    @Override
    public void addCustomers(Customer customer) {
        db.add(customer);
    }

    @Override
    public void updateCustomers(Integer id, Customer customer) {
        Optional<Customer> foundCustomer = db.stream()
                .filter(p -> p.getId().equals(id))
                .findAny();

        foundCustomer.ifPresent(p -> {
            Integer index = db.indexOf(p);
            db.add(index, customer);
            db.remove(p);
        });
    }

    @Override
    public void deleteCustomer(Integer id) {
        Optional<Customer> foundCustomer = db.stream()
                .filter(p -> p.getId().equals(id))
                .findAny();

        foundCustomer.ifPresent(p -> db.remove(p));

    }
}
