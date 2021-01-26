package com.guilherme.apijogo.jogoanimal.model;

import com.guilherme.apijogo.jogoanimal.core.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Animals extends AbstractEntity {

	private Long id;
	private String name;

	@ManyToMany
	@JoinTable(name = "animal_has_condition", joinColumns =
			{@JoinColumn(name = "id_animal")}, inverseJoinColumns =
			{@JoinColumn(name = "id_condition")})
	private List<Conditions> conditions;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Conditions> getConditions() {
		return conditions;
	}

	public void setConditions(List<Conditions> conditions) {
		this.conditions = conditions;
	}
	
	
}
