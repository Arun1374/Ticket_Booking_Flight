package com.ticket.frs;

public class main {

    public static void main(String[] args) {
        Passenger passenger = new Passenger("Maharashtra", "Mumbai", "Imagica Hotel", "Arun", "+91922127453", "ar@gmail.com");
        Flight flight = new Flight("TRF234AEZ" , "Indigo" , 75 ,48);
        RegularTicket regularTicket = new RegularTicket("PNR433242", "Delhi", "Bihar", flight, "Indigo", "1:40", passenger, "4:10", 43630.70f, false);
        TouristTicket touristTicket = new TouristTicket("PNR445212", "Mumbai", "Goa", flight, "Indigo", "1:20", passenger, "4:10", 43630.70f, false);
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }


    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.get_Pnr());
    }
}