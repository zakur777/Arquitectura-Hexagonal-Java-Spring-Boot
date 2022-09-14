package cl.zakur.java.arq.appdemoarqlayers.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public class GenericEntity implements Serializable {

    private static final long serialVersionUID = -1685422404292124289L;

    @Column(name = "ESTADO")
    private String estado = "1";
}
