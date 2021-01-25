package com.guilherme.apijogo.jogoanimal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ConditionDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String condition;

	public ConditionDTO(Conditions conditions) {
		this.id = conditions.getId();
		this.condition = conditions.getCondition();
	}

	public static List<ConditionDTO> fromEntityList(List<Conditions> conditions) {

		Function<Conditions, ConditionDTO> mapping = ConditionDTO::new;

		return conditions.stream().map(mapping).collect(Collectors.toList());
	}
}