package com.jasko.sfgpetclinic.repositories;

import com.jasko.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
