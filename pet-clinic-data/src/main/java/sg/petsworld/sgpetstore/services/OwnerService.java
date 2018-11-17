package sg.petsworld.sgpetstore.services;

/*
 * Created by NR on 18 nov 2018
 */

import sg.petsworld.sgpetstore.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}