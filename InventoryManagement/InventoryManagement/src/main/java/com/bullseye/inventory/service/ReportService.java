package com.bullseye.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bullseye.inventory.entity.Report;
import com.bullseye.inventory.repository.EmployeeRepository;
import com.bullseye.inventory.repository.ReportRepository;

@Service
public class ReportService {

	
	@Autowired
	ReportRepository report_repo;

	public Report sendReport(Report data) {
		
		return report_repo.save(data);
	}

	public List<Report> getReportBySubmittedTo(String submittedTo) {
		return report_repo.findBySubmittedTo(submittedTo);
	}
	
	
	
	
	
}
