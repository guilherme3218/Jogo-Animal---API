package com.guilherme.apijogo.jogoanimal.service;

import com.guilherme.apijogo.jogoanimal.model.ConditionDTO;
import com.guilherme.apijogo.jogoanimal.model.Conditions;
import com.guilherme.apijogo.jogoanimal.repository.ConditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConditionServiceImpl implements ConditionService {

	private ConditionRepository conditionRepository;

	@Autowired
	public ConditionServiceImpl(ConditionRepository conditionRepository) {
		this.conditionRepository = conditionRepository;
	}

	@Override
	public ConditionDTO saveCondition(Conditions conditions) {
		return new ConditionDTO(this.conditionRepository.save(conditions));
	}
}
