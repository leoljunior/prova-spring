package com.example.LeonardoLima.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.LeonardoLima.model.Equipment;
import com.example.LeonardoLima.repository.EquipmentRepository;

@RestController
@RequestMapping("/equipment")
public class EquipmentController {
	
	 @Autowired
	 private EquipmentRepository equipmentRepository;

	@GetMapping
	public List<Equipment> getAllEquipments() {
		return equipmentRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Equipment createEquipment(@RequestBody Equipment equipment) {
		return equipmentRepository.save(equipment);
	}
}
