package com.nelsonairtech.flight;

import com.nelsonairtech.customer.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Flight {
    private LocalDate timeOfFlight;
    private int FlightNum;
    private String flightStatus;
    private String origin;
    private String destination;
    private String planeModelType;
    private int Capacity;
    private ArrayList<String> customers;
    private int count;
    private Boolean isFullyBooked;

    public Flight(LocalDate timeOfFlight, int flightNum, String flightStatus, String origin, String destination, String planeModelType, int capacity, int count) {
        this.timeOfFlight = timeOfFlight;
        FlightNum = flightNum;
        this.flightStatus = flightStatus;
        this.origin = origin;
        this.destination = destination;
        this.planeModelType = planeModelType;
        Capacity = capacity;
        this.customers = new ArrayList<String>();
        this.count = count;
        this.isFullyBooked = false;
    }

    public LocalDate getTimeOfFlight() {
        return timeOfFlight;
    }

    public void setTimeOfFlight(LocalDate timeOfFlight) {
        this.timeOfFlight = timeOfFlight;
    }

    public int getFlightNum() {
        return FlightNum;
    }

    public void setFlightNum(int flightNum) {
        FlightNum = flightNum;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPlaneModelType() {
        return planeModelType;
    }

    public void setPlaneModelType(String planeModelType) {
        this.planeModelType = planeModelType;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public ArrayList<String> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<String> customers) {
        this.customers = customers;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Boolean getFullyBooked() {
        return isFullyBooked;
    }

    public void setFullyBooked(Boolean fullyBooked) {
        isFullyBooked = fullyBooked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return FlightNum == flight.FlightNum && Capacity == flight.Capacity && count == flight.count && Objects.equals(timeOfFlight, flight.timeOfFlight) && Objects.equals(flightStatus, flight.flightStatus) && Objects.equals(origin, flight.origin) && Objects.equals(destination, flight.destination) && Objects.equals(planeModelType, flight.planeModelType) && Objects.equals(customers, flight.customers) && Objects.equals(isFullyBooked, flight.isFullyBooked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeOfFlight, FlightNum, flightStatus, origin, destination, planeModelType, Capacity, customers, count, isFullyBooked);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "timeOfFlight=" + timeOfFlight +
                ", FlightNum=" + FlightNum +
                ", flightStatus='" + flightStatus + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", planeModelType='" + planeModelType + '\'' +
                ", Capacity=" + Capacity +
                ", customers=" + customers +
                ", count=" + count +
                ", isFullyBooked=" + isFullyBooked +
                '}';
    }
}
