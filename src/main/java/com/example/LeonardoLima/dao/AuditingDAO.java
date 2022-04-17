package com.example.LeonardoLima.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LeonardoLima.model.Auditing;
import com.example.LeonardoLima.model.Equipment;

public interface AuditingDAO extends JpaRepository<Equipment, Long> {

}
