package sg.petsworld.sgpetstore.model;

import java.io.Serializable;

/*
 * created by NR on 18 Nov 2018
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
