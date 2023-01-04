
package com.portfolio.gag.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String anioE;
    private String descripcionE;

    public Educacion() {
    }

    public Educacion(String nombreE, String anioE, String descripcionE) {
        this.nombreE = nombreE;
        this.anioE = anioE;
        this.descripcionE = descripcionE;
    }

   
    
    
    
}
