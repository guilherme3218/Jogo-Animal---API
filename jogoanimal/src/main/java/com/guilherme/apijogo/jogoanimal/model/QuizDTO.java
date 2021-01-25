package com.guilherme.apijogo.jogoanimal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private List<ConditionDTO> conditions;

	public QuizDTO(Animals animals) {
		this.id = animals.getId();
		this.name = animals.getName();
		this.conditions = ConditionDTO.fromEntityList(animals.getConditions());
	}

	public static List<QuizDTO> fromAnimalList(List<Animals> animals) {
		return animals.stream().map(QuizDTO::new).collect(Collectors.toList());
	}
}
