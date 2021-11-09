package com.nelsonairtech.ticket;

import java.time.LocalDate;
import java.util.Objects;

public class Ticket {
    private String name;
    private String passportNumber;

    private int ticketNumber;
    private String timeOfFlight;
    private int flightNumber;
    private String origin;
    private String destination;

    public String getName() {
        return name;
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

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getTimeOfFlight() {
        return timeOfFlight;
    }

    public void setTimeOfFlight(String timeOfFlight) {
        this.timeOfFlight = timeOfFlight;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return ticketNumber == ticket.ticketNumber && flightNumber == ticket.flightNumber && Objects.equals(name, ticket.name) && Objects.equals(passportNumber, ticket.passportNumber) && Objects.equals(timeOfFlight, ticket.timeOfFlight) && Objects.equals(origin, ticket.origin) && Objects.equals(destination, ticket.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passportNumber, ticketNumber, timeOfFlight, flightNumber, origin, destination);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "name='" + name + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", ticketNumber=" + ticketNumber +
                ", timeOfFlight='" + timeOfFlight + '\'' +
                ", flightNumber=" + flightNumber +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
