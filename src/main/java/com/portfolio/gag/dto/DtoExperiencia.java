
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
    

    public DtoExperiencia() {
    }

    public DtoExperiencia( String puestoE, String descripcionE) {
        
        this.puestoE = puestoE;
        this.descripcionE = descripcionE;
     
    }
    
 
    
}
