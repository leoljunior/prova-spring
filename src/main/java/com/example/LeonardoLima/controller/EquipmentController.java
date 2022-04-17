package com.example.LeonardoLima.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.LeonardoLima.model.Equipment;
import com.example.LeonardoLima.services.EquipmentService;

@RestController
@RequestMapping("/equipment")
public class EquipmentController {

	@Autowired
	private EquipmentService equipmentService;

	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Equipment createCategory(@RequestBody Equipment equipment) {
		return equipmentService.createEquipment(equipment);
	}

	@GetMapping
	public List<Equipment> getAllEquipments() {
		return equipmentService.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Equipment> findEquipmentById(@PathVariable(value = "id") Long id) {
		return equipmentService.findEquipmentById(id);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public ResponseEntity<Object> deleteEquipment(@PathVariable(value = "id") Long id) {
		Optional<Equipment> equip = equipmentService.findEquipmentById(id);
		if (!equip.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Equipment not found");
		}
		equipmentService.deleteEquipment(equip.get());
		return ResponseEntity.status(HttpStatus.OK).body("Equipment deleted successfully!!");
	}

	@PutMapping("/{id}")
	public ResponseEntity<Object> updateCategory(@PathVariable Long id, @RequestBody Equipment equipment) {
		Optional<Equipment> equip = equipmentService.findEquipmentById(id);
		if (!equip.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Equipment not found");
		}
		var Equipment = equip.get();
		Equipment.setName(equipment.getName());
		Equipment.setNextMaitenanceDate(equipment.getNextMaitenanceDate());
		Equipment.setProvider(equipment.getProvider());
		Equipment.setTag(equipment.getTag());
		Equipment.setWeight(equipment.getWeight());
		return ResponseEntity.status(HttpStatus.OK).body(equipmentService.createEquipment(Equipment));
	}
}
