package com.guilherme.apijogo.jogoanimal.repository;

import com.guilherme.apijogo.jogoanimal.model.Conditions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConditionRepository extends JpaRepository<Conditions, Long> {
}
