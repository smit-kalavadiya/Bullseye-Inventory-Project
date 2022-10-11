package com.bullseye.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bullseye.inventory.entity.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, Integer> {

	Report findBySubmittedTo(String submittedTo);

	
}
