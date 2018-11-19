package sg.petsworld.sgpetstore.map;

import sg.petsworld.sgpetstore.model.Pet;
import sg.petsworld.sgpetstore.services.CrudService;

import java.util.Set;

/*
 * Created by NR on 11/18
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
