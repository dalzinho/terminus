package com.terminl.demo.database.entity.visit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportVisitRepository extends JpaRepository<AirportVisit, Integer> {
}
