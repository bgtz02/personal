package com.aa.digitalwallet.entity;

public class PurchaseRequest {
    
    Integer clientId;
    String firstName;
    String lastName;
    String flightNumber;
    
    public PurchaseRequest() {
    }

    public PurchaseRequest(Integer clientId, String firstName, String lastName, String flightNumber) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.flightNumber = flightNumber;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString() {
        return "PurchaseRequest [clientId=" + clientId + ", firstName=" + firstName + ", flightNumber=" + flightNumber
                + ", lastName=" + lastName + "]";
    }

}
