package com.jasko.sfgpetclinic.services;

import com.jasko.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);
    Set<Pet> findAll();
}
