
package com.portfolio.gag.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;



@Getter  @Setter
public class DtoProyectos {
    
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    private String anioP;

    public DtoProyectos() {
    }

    public DtoProyectos(String nombreP, String descripcionP, String anioP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.anioP = anioP;
    }

   

 
    
}
