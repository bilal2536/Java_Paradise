package com.intiformation.app.model;

public class Trip {
    private long id;
    private String placeOfDeparture;
    private String placeOfArrival;
    private float price;

    // Constructor
    public Trip() {
    }

    // Getter
    public long getId() {
        return this.id;
    }
    public String getPlaceOfDeparture() {
        return this.placeOfDeparture;
    }
    public String getPlaceOfArrival() {
        return this.placeOfArrival;
    }
    public float getPrice() {
        return this.price;
    }

    // Setter
    public void setId(long id) {
        this.id = id;
    }
    public void setPlaceOfDeparture(String placeOfDeparture) {
        this.placeOfDeparture = placeOfDeparture;
    }
    public void setPlaceOfArrival(String placeOfArrival) {
        this.placeOfArrival = placeOfArrival;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}
