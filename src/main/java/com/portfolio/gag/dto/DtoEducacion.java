
package com.portfolio.gag.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoEducacion {
    

    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    private String anioE;

    public DtoEducacion() {
    }

    public DtoEducacion(String nombreE, String descripcionE, String anioE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.anioE = anioE;
    }
}

