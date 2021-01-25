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

	private String condition;

	@ManyToMany(mappedBy = "conditions")
	private List<Animals> animals;
}
