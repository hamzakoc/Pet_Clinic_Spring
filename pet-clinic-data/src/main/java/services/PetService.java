package services;

import pet_clinic_spring.model.Pet;

import java.util.Set;

public interface PetService {


    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
