package sg.petsworld.sgpetstore.map;

/*
 * Created by NR on 18 Nov 2018
 */

import org.springframework.stereotype.Service;
import sg.petsworld.sgpetstore.model.Vet;
import sg.petsworld.sgpetstore.services.VetService;

import java.util.Set;
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }


}
