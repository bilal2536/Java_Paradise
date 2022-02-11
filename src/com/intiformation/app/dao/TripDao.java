package com.intiformation.app.dao;

import com.intiformation.app.model.Trip;

import java.util.List;

public interface TripDao {
    public void createTrip(Trip trip);
    public void findTripById(long id);
    public void updateTrip(Trip trip);
    public void removeTrip(Trip trip);
    public List<Trip> findAllTrip();
}
