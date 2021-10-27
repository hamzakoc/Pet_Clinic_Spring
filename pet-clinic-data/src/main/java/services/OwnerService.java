package services;

import pet_clinic_spring.model.Owner;

import java.util.Set;


public interface OwnerService  extends CrudService<Owner,Long>{

    Owner findByLastname(String lastname);

}
