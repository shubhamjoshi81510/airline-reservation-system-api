package com.shubham.ars.repository;

import com.shubham.ars.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository  extends JpaRepository<Airport, String> {
}
