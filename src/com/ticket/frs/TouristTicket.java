package com.ticket.frs;

public class TouristTicket extends Ticket {
    private String hotel_Address;
    private String[] selected_Tourist_Location;

    public TouristTicket(String pnr, String from, String to, Flight f, String departureDateTime,
                         String arrivalDateTime, Passenger p, String seatNumber, float price, boolean cancelled) {
        super(pnr, from, to, f, departureDateTime, arrivalDateTime, p, seatNumber, price, cancelled);
        this.hotel_Address = "DY Patil Stadium Navi Mumbai";
        this.selected_Tourist_Location = new String[5];
    }

    public String[] get_Tourist_Locations() {
        for (int i = 0; i < 5; i++) {
            System.out.println(selected_Tourist_Location[i]);
        }
        return selected_Tourist_Location;
    }

    public void removeTouristLocations(String location) {
        int index = Integer.parseInt(location);
        int[] array = new int[selected_Tourist_Location.length - 1];
        for (int i = 0; i < selected_Tourist_Location.length; i++) {
            if (i == index) {
                continue;
            }
            array[i] = Integer.parseInt(selected_Tourist_Location[i]);
        }

    }
    public void addTouristLocations(String location) {
        int index = Integer.parseInt(location);
        int[] array2 = new int[selected_Tourist_Location.length + 1];
        for (int i = 0; i < selected_Tourist_Location.length; i++) {
            if (i == index) {
                continue;
            }
            array2[i] = Integer.parseInt(selected_Tourist_Location[i]);
        }
    }
    public String get_hotel_Address() {
        return hotel_Address;
    }
}