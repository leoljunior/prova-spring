package com.example.LeonardoLima.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;

@Entity
@IdClass(Equipment.class)
public class Equipment extends Auditing implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tag;
	private String name;
	private String provider;
	private LocalDate nextMaitenanceDate;
	private Double weight;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "equipment")
	private List<Auditing> auditings = new ArrayList<Auditing>();

	public void addAuditings(Auditing... auditings) {
		this.auditings.addAll(Arrays.asList(auditings));
	}

	public Equipment() {
	};

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public LocalDate getNextMaitenanceDate() {
		return nextMaitenanceDate;
	}

	public void setNextMaitenanceDate(LocalDate nextMaitenanceDate) {
		this.nextMaitenanceDate = nextMaitenanceDate;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}	

	public List<Auditing> getAuditings() {
		return auditings;
	}

	public void setAuditings(List<Auditing> auditings) {
		this.auditings = auditings;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipment other = (Equipment) obj;
		return Objects.equals(id, other.id);
	}

}