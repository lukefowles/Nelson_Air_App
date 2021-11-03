package com.nelsonairtech.customer;

import com.nelsonairtech.flight.Flight;
import com.nelsonairtech.ticket.Ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Customer {
    private Integer id;
    private String name;
    private String passportNumber;
    private String mobileNumber;
    private String email;
    private List<Ticket> ticketList;
    private List<Flight> flights;

    public Customer(Integer id, String name, String passportNumber, String mobileNumber, String email) {
        this.id = id;
        this.name = name;
        this.passportNumber = passportNumber;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.ticketList = new ArrayList<Ticket>();
        this.flights = new ArrayList<Flight>();
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(name, customer.name) && Objects.equals(passportNumber, customer.passportNumber) && Objects.equals(mobileNumber, customer.mobileNumber) && Objects.equals(email, customer.email) && Objects.equals(ticketList, customer.ticketList) && Objects.equals(flights, customer.flights);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, passportNumber, mobileNumber, email, ticketList, flights);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                ", ticketList=" + ticketList +
                ", flights=" + flights +
                '}';
    }
}
