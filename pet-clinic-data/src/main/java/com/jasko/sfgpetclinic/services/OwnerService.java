package com.jasko.sfgpetclinic.services;

import com.jasko.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}
