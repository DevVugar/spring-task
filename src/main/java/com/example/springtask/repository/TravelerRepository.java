package com.example.springtask.repository;

import com.example.springtask.model.entity.Tour;
import com.example.springtask.model.entity.Traveler;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TravelerRepository extends JpaRepository<Traveler,Long> {


    List<Tour> getToursByTraveler(Long id);
}
