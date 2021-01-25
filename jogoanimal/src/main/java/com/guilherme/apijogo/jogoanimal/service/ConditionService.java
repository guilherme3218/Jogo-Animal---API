package com.guilherme.apijogo.jogoanimal.service;

import com.guilherme.apijogo.jogoanimal.model.ConditionDTO;
import com.guilherme.apijogo.jogoanimal.model.Conditions;

public interface ConditionService {


	ConditionDTO saveCondition(Conditions conditions);
}
