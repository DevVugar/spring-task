package com.example.springtask.repository;

import com.example.springtask.model.entity.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DestinationRepository extends JpaRepository<Destination,Long> {
}
