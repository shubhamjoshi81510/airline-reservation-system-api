package com.shubham.ars.repository;

import com.shubham.ars.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository  extends JpaRepository<Flight, String> {
}
