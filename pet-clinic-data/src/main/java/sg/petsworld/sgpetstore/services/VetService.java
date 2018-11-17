package sg.petsworld.sgpetstore.services;

import sg.petsworld.sgpetstore.model.Vet;

import java.util.Set;

/*
 * Created by NR on 18 Nov 2018
 */
public interface VetService {

    Vet findById(long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
