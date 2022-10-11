package com.bullseye.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bullseye.inventory.entity.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, Integer> {

	List<Report> findBySubmittedTo(String submittedTo);

	 //findBySubmittedTo(String submittedTo);

	
}
