package com.example.LeonardoLima.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LeonardoLima.model.Equipment;
import com.example.LeonardoLima.repository.EquipmentRepository;

@Service
public class EquipmentService {

	@Autowired
	EquipmentRepository equipmentRepository;

	public Equipment createEquipment(Equipment equipment) {
		return equipmentRepository.save(equipment);
	}

	public List<Equipment> findAll() {
		return equipmentRepository.findAll();
	}
	
	public Optional<Equipment> findEquipmentById(Long id) {
		return equipmentRepository.findById(id);
        
    }

	public void deleteEquipment(Equipment equipment) {
		equipmentRepository.delete(equipment);
	}

//	public void updateEquipment(Equipment equipment, Long id) {
//		Optional<Equipment> equip = findEquipmentById(id);
//        updateData(equipment, equip);
//        equipmentRepository.save(equip);
//    }
//	private void updateData(Optional<Equipment> equip, Equipment equipment) {
//		equipment.setName(equip.getName());
//		equipment.setNextMaitenanceDate(equip.);
//    }
}
