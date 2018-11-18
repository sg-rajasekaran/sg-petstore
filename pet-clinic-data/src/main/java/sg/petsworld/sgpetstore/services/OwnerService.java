package sg.petsworld.sgpetstore.services;

/*
 * Created by NR on 18 nov 2018
 */

import sg.petsworld.sgpetstore.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);


}
