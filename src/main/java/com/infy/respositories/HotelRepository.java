package com.infy.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.entites.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}
