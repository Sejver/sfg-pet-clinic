package com.jasko.sfgpetclinic.bootstrap;


import com.jasko.sfgpetclinic.services.OwnerService;
import com.jasko.sfgpetclinic.services.VetService;
import com.jasko.sfgpetclinic.services.map.OwnerServiceMap;
import com.jasko.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService=new OwnerServiceMap();
        vetService= new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        //add some names for owners and vets
    }


}
