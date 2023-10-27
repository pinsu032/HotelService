package com.infy.services;

import java.util.List;

import com.infy.entites.Hotel;

public interface HotelService {

    //create

    Hotel create(Hotel hotel);

    //get all
    List<Hotel> getAll();

    //get single
    Hotel get(Integer id);

}
