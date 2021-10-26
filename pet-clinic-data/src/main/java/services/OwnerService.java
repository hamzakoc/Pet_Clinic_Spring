package services;

import pet_clinic_spring.model.Owner;

import java.util.Set;

public interface OwnerService {


    Owner findByLastname(String lastname);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
