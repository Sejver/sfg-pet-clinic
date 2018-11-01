package com.jasko.sfgpetclinic.services.map;

import com.jasko.sfgpetclinic.model.Speciality;
import com.jasko.sfgpetclinic.model.Vet;
import com.jasko.sfgpetclinic.services.SpecialityService;
import com.jasko.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        if(object.getSpecialies().size()>0){
            object.getSpecialies().forEach(speciality -> {
                if (speciality.getId()==null){
                    Speciality savedSpeciality=specialityService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }

            });
        }

        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
