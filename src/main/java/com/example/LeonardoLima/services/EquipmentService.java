package com.example.LeonardoLima.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LeonardoLima.dao.EquipmentDAO;
import com.example.LeonardoLima.model.Equipment;

@Service
public class EquipmentService {

	@Autowired
	private EquipmentDAO dao;

	public Equipment createEquipment(Equipment equipment) {
		return dao.save(equipment);
	}

	public List<Equipment> findAll() {		
		return dao.findAll();		
	}
	
	public Optional<Equipment> findEquipmentById(Long id) {
		return dao.findById(id);
        
    }

	public void deleteEquipment(Equipment equipment) {
		dao.delete(equipment);
	}
}
