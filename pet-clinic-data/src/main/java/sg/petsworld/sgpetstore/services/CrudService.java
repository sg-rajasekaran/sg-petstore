package sg.petsworld.sgpetstore.services;

import java.util.Set;

/*
 * Created by NR on 18 Nov 2018
 */
public interface CrudService<T, ID> {

    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);

}
