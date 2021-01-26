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
public class Conditions extends AbstractEntity {

	private Long id;
	private String condition;

	@ManyToMany(mappedBy = "conditions")
	private List<Animals> animals;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public List<Animals> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animals> animals) {
		this.animals = animals;
	}
	
	
}
