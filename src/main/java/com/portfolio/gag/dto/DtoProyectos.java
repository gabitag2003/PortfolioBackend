
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

    public DtoProyectos() {
    }

    public DtoProyectos(String nombreP, String descripcionP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
    }

 
    
}
