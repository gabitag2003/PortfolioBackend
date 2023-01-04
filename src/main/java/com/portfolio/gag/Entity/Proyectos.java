
package com.portfolio.gag.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreP;
    private String anioP;
    private String descripcionP;

    public Proyectos() {
    }

    public Proyectos(String nombreP, String anioP, String descripcionP) {
        this.nombreP = nombreP;
        this.anioP = anioP;
        this.descripcionP = descripcionP;
    }

    
    
    
    
    
}
