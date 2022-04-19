package com.example.LeonardoLima.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LeonardoLima.model.Auditing;

public interface AuditingDAO extends JpaRepository<Auditing, Long> {

}
