package com.ticket.frs;

public class RegularTicket extends Ticket {
    private String specialServices = "Wifi, Drinks,Foods";

    public void update_Specials_Services(String specialServices) {
        this.specialServices = specialServices;
    }
    public String get_Special_Services() {
        return specialServices;
    }
    public RegularTicket(String pnr, String from, String to, Flight fl, String departureDateTime,
                         String arrivalDateTime, Passenger pa, String seatNumber, float price, boolean cancelled) {
        super(pnr, from, to, fl, departureDateTime, arrivalDateTime, pa, seatNumber, price, cancelled);
        this.specialServices = specialServices;
    }
}