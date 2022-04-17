package com.example.LeonardoLima.services;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

import com.example.LeonardoLima.model.Equipment;

public class AuditorAwareImpl implements AuditorAware<Equipment> {

	@Override
	public Optional<Equipment> getCurrentAuditor() {
		return Optional.empty();
	}

}
