package com.example.LeonardoLima.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.LeonardoLima.model.Equipment;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

}
