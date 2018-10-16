package com.jasko.sfgpetclinic.services;

import com.jasko.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet savee(Vet vet);

    Set<Vet> findAll();
}
