package com.ticket.frs;

public class Flight {
    private int seatsBooked;
    private int capacity;
    private String flightNo;
    private String airline;

    public String flightNo() {
        return flightNo;
    }
    public Flight(String flightNo, String airline, int capacity, int seatsBooked) {
        this.airline = airline;
        this.capacity = capacity;
        this.flightNo = flightNo;
        this.seatsBooked = seatsBooked;
    }

    public String Airline() {
        return airline;
    }

    public void Airline(String airline) {
        this.airline = airline;
    }

    public int Capacity() {
        return capacity;
    }

    public void Capacity(int capacity) {
        this.capacity = capacity;
    }

    public int seatsBooked() {
        return seatsBooked;
    }

    public void flightNo(String flightNo) {
        this.flightNo = flightNo;
    }
    // remove
    public boolean checkAvailability() {
        return this.seatsBooked() == this.Capacity() ? false : true;
    }
    public void seatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;
    }

    // remove
    public void updateBookingCounter() {
        this.seatsBooked(this.seatsBooked() + 1);
    }
    public String FlightDetails() {
        return "Flight_No: " + flightNo + ", Airline: " + airline +
                ", Capacity: " + capacity + ", Booked_Seats: " + seatsBooked;
    }
}