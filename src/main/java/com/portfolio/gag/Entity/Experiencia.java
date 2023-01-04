
package com.portfolio.gag.Entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;





@Getter  @Setter

@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String puestoE;
    private String anioE;
    private String descripcionE;

    public Experiencia() {
    }

    public Experiencia(String puestoE, String anioE, String descripcionE) {
        this.puestoE = puestoE;
        this.anioE = anioE;
        this.descripcionE = descripcionE;
    }


    
    
    
    }
  

   
 
    
 
        
    
