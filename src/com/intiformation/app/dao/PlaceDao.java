package com.intiformation.app.dao;

import com.intiformation.app.model.Place;

import java.util.List;

public interface PlaceDao {
    public void createPlace(Place place);
    public void findPlaceById(long id);
    public void updatePlace(Place place);
    public void removePlace(Place place);
    public List<Place> findAllPlace();
}
