package com.shubham.ars.entities;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="flight_schedules")
@Data
@ToString
public class FlightSchedule {

    @Id
    @Column(name="id")
    private String id;

    @ManyToOne(optional = false)
    @JoinColumn(name="flight_id")
    private Flight flight;

    @ManyToOne(optional = false)
    @JoinColumn(name="pilot_id")
    private Pilot pilot;

    @Column(name="journey_start_date")
    private LocalDateTime journeyStartDate;

    @ManyToOne(optional = false)
    @JoinColumn(name="source_airport_id")
    private Airport sourceAirport;

    @Column(name="journey_end_date")
    private LocalDateTime journeyEndDate;

    @ManyToOne(optional = false)
    @JoinColumn(name="dest_airport_id")
    private Airport destAirport;

    @Column(name="max_waiting_capacity")
    private Integer maxWaitingCapacity;

    @Column(name="current_status")
    private Integer currentStatus;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    @Column(name="created_by")
    private String createdBy;

    @Column(name="last_updated_at")
    private LocalDateTime lastUpdatedAt;

    @Column(name="last_updated_by")
    private String lastUpdatedBy;

}
