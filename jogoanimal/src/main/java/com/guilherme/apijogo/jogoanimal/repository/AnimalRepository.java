package com.guilherme.apijogo.jogoanimal.repository;

import com.guilherme.apijogo.jogoanimal.model.Animals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  AnimalRepository extends JpaRepository<Animals, Long> {
}
