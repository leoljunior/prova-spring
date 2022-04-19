package com.example.LeonardoLima.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

@Entity
public class Auditing {
	
	public Auditing() {}

	public Auditing(Long id, Equipment equipment, Long identifier, String registerCode, Date date) {
		this.id = id;
		this.equipment = equipment;
		this.identifier = identifier;
		this.registerCode = registerCode;
		this.date = date;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Equipment equipment;
	
	@JoinColumn(name = "equipment_id")
	protected Long identifier;
	
	@CreatedBy
	protected String registerCode;
	
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	protected Date date;
	
	//protected String operation;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
