package sg.petsworld.sgpetstore.bootstrap;
/*
 * created by NR on 21 Nov 2018
 */

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sg.petsworld.sgpetstore.model.Owner;
import sg.petsworld.sgpetstore.model.PetType;
import sg.petsworld.sgpetstore.model.Vet;
import sg.petsworld.sgpetstore.services.OwnerService;
import sg.petsworld.sgpetstore.services.PetTypeService;
import sg.petsworld.sgpetstore.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }



    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glananne");
        ownerService.save(owner2);

        System.out.println("Loaded Owners Data");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jesse");
        vet2.setLastName("Porter");
        vetService.save(vet2);

        System.out.println("Loaded Vets Data");


    }
}
