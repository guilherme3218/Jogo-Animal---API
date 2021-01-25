package com.guilherme.apijogo.jogoanimal.service;

import com.guilherme.apijogo.jogoanimal.exception.AnimalNotFoundException;
import com.guilherme.apijogo.jogoanimal.model.Animals;
import com.guilherme.apijogo.jogoanimal.model.QuizDTO;
import com.guilherme.apijogo.jogoanimal.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {

	private AnimalRepository animalRepository;

	@Autowired
	public AnimalServiceImpl(AnimalRepository animalRepository) {
		this.animalRepository = animalRepository;
	}

	@Override
	public QuizDTO getAnimal(Long id) throws AnimalNotFoundException {
		return new QuizDTO(this.animalRepository.findById(id).orElseThrow(AnimalNotFoundException::new));
	}

	@Override
	public List<QuizDTO> findAllAnimals() {
		return QuizDTO.fromAnimalList(this.animalRepository.findAll());
	}

	@Override
	public QuizDTO saveAnimal(Animals animals) throws AnimalNotFoundException {
		animals = this.animalRepository.save(animals);
		return getAnimal(animals.getId());
	}

}
