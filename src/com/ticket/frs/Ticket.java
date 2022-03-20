package com.ticket.frs;

public abstract class Ticket {
    private String pnr;
    private String from;
    private String to;
    private Flight fl;
    private String departureDateTime;
    private String arrivalDateTime;
    private Passenger pa;
    private String seatNumber;
    private float price;
    private boolean cancelled;

    public Ticket(String pnr, String from, String to, Flight fl, String departureDateTime, String arrivalDateTime, Passenger pa, String seatNumber, float price, boolean cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.fl = fl;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.pa = pa;
        this.seatNumber = seatNumber;
        this.price = price;
        this.cancelled = cancelled;
    }

    public void putPnr(String pnr) {
        this.pnr = pnr;
    }

    public String get_Pnr() {
        return pnr;
    }

    public void putFrom(String from) {
        this.from = from;
    }

    public String get_From() {
        return from;
    }

    public String get_To() {
        return to;
    }

    public void putTo(String to) {
        this.to = to;
    }

    public void putFl(Flight fl) {
        this.fl = fl;
    }

    public Flight get_Fl() {
        return fl;
    }



    public String get_DepartureDateTime() {
        return departureDateTime;
    }

    public void putDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String get_ArrivalDateTime() {
        return arrivalDateTime;
    }

    public void putArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public Passenger get_Pa() {
        return pa;
    }

    public void putPa(Passenger pa) {
        this.pa = pa;
    }

    public String get_seatNumber() {
        return seatNumber;
    }

    public void putseatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public float get_Price() {
        return price;
    }

    public void putPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void putCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public String checkStatus() {
        if (cancelled) {
            return "Cancelled!!!";
        } {
            return "Confirmed!!!";
        }
    }
    public int get_Flight_Duration() {
        int duration = Integer.parseInt(departureDateTime) - Integer.parseInt(arrivalDateTime);
        return duration;
    }

    public void cancel() {
        cancelled = true;
    }
}