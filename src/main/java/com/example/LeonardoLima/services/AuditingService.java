package com.example.LeonardoLima.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LeonardoLima.dao.AuditingDAO;
import com.example.LeonardoLima.model.Auditing;

@Service
public class AuditingService {

	@Autowired
	private AuditingDAO dao;

	public List<Auditing> findAll() {		
		return dao.findAll();		
	}
}