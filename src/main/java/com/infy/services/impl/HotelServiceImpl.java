package com.infy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.entites.Hotel;
import com.infy.exceptions.ResourceNotFoundException;
import com.infy.respositories.HotelRepository;
import com.infy.services.HotelService;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(Integer id) {
    	try {
         Hotel hotel = hotelRepository.findById(id).get();
         return hotel;
    	}catch (Exception e) {
			throw new ResourceNotFoundException("Hotel not found for given id");
		}
    
    }
}
