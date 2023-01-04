
package com.portfolio.gag.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;





@Getter @Setter 
public class DtoExperiencia {
    
      
    @NotBlank
    private String puestoE;
    @NotBlank
    private String descripcionE;
    private String anioE;

    public DtoExperiencia() {
    }

    public DtoExperiencia(String puestoE, String descripcionE, String anioE) {
        this.puestoE = puestoE;
        this.descripcionE = descripcionE;
        this.anioE = anioE;
    }
    

    
    
 
    
}
