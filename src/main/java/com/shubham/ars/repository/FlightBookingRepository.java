package com.shubham.ars.repository;

import com.shubham.ars.entities.FlightBooking;
import com.shubham.ars.entities.FlightSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FlightBookingRepository extends JpaRepository<FlightBooking,String> {

    int countByCurrentStatusNot(int status);

    Optional<FlightBooking> findFirstByFlightScheduleAndCurrentStatusOrderByCreatedAtAsc(FlightSchedule flightSchedule, Integer currentStatus);
}
