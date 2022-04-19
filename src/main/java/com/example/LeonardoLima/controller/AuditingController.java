package com.example.LeonardoLima.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.LeonardoLima.model.Auditing;
import com.example.LeonardoLima.services.AuditingService;

@RestController
@RequestMapping("/auditings")
public class AuditingController {
	
	@Autowired
	private AuditingService auditingService;

	@GetMapping
	public List<Auditing> getAllAuditings() {
		return auditingService.findAll();
	}
}