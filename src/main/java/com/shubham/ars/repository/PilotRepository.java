package com.shubham.ars.repository;

import com.shubham.ars.entities.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PilotRepository extends JpaRepository<Pilot, String> {
}
