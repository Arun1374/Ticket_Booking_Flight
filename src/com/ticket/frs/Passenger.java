package com.ticket.frs;

public class Passenger {
    private static Address address;
    private static Contact contact;
    private int id;
    private static int idCounter;

    public Passenger(String State, String City,
                     String addressStreet, String contactName, String contactPhone,
                     String contactEmail) {
        this.address = new Address(State, City, addressStreet);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
        this.id = ++idCounter;
    }

    public Passenger() {
        this("Maharashtra", "Mumbai", "Imagica Hotel", "Arun", "+91922127453", "ar@gmail.com");
    }

    public String AddressInfo() {
        return "Passenger address is: " + address.state + " " + address.city + " " + address.street;
    }

    public String ContactInfo() {
        return "Passenger name is: " + contact.name + " EmailId: " + contact.email + " Phone Number is: " + contact.phone;
    }

    public void updateAddressInfo(String addressDetail) {
        addressDetail = AddressInfo();
    }


    public void updateContactInfo(String contactDetail) {
        contactDetail = ContactInfo();
    }



    private static class Contact {
        String name, phone, email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public Contact() {
            this("Arun", "+91922127453", "ar@gmail.com");
        }
    }

    public int PassengerCount(int idCounter, int id) {
        return idCounter;
    }
    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public Address() {
            this("Imagica Hotel", "Mumbai", "Maharashtra");
        }
    }

}