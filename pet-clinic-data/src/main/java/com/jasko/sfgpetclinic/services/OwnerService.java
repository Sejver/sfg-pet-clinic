package com.jasko.sfgpetclinic.services;

import com.jasko.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findbyId(Long id);
    Owner save(Owner owner);
    Set<Owner> finfAll();
}
