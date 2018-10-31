package com.jasko.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

    private Set<Speciality> specialies=new HashSet<>();

    public Set<Speciality> getSpecialies() {
        return specialies;
    }

    public void setSpecialies(Set<Speciality> specialies) {
        this.specialies = specialies;
    }
}
