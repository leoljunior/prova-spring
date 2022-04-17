package com.example.LeonardoLima.model;

import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Auditing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long identifier;
	
	@CreatedBy
	protected String registerCode;
	
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	protected Date date;
	
	//protected String operation;
	
}
