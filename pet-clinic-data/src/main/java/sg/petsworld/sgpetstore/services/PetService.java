package sg.petsworld.sgpetstore.services;

import sg.petsworld.sgpetstore.model.Pet;

import java.util.Set;

/*
 * created by NR on 18 Nov 2018
 */
public interface PetService {

    Pet findById(long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
