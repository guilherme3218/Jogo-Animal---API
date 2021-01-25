package com.guilherme.apijogo.jogoanimal.service;


import com.guilherme.apijogo.jogoanimal.exception.AnimalNotFoundException;
import com.guilherme.apijogo.jogoanimal.model.Animals;
import com.guilherme.apijogo.jogoanimal.model.QuizDTO;

import java.util.List;

public interface AnimalService {

	QuizDTO getAnimal(Long id) throws Exception;

	List<QuizDTO> findAllAnimals() throws Exception;

	QuizDTO saveAnimal(Animals animals) throws AnimalNotFoundException;

}
