package com.bullseye.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bullseye.inventory.entity.Employee;
import com.bullseye.inventory.entity.Report;
import com.bullseye.inventory.service.ReportService;

@RestController
public class ReportController {
	
	@Autowired
	ReportService service;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/Report")
	public Report sendReport(@RequestBody Report data) {
		return service.sendReport(data);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getReportBySubmitted/{name}")
	public List<Report> getReportBySubmittedTo(@PathVariable("name") String submittedTo) {
		return service.getReportBySubmittedTo(submittedTo);
	}
	
}
