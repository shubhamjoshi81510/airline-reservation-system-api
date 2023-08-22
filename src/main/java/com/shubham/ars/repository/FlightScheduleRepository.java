package com.shubham.ars.repository;

import com.shubham.ars.entities.FlightSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightScheduleRepository extends JpaRepository<FlightSchedule, String> {

}
