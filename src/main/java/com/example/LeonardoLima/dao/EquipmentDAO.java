package com.example.LeonardoLima.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LeonardoLima.model.Equipment;

public interface EquipmentDAO extends JpaRepository<Equipment, Long> {

}
