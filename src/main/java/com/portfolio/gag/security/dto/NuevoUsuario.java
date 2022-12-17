
package com.portfolio.gag.security.dto;

import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
public class NuevoUsuario {
    private String nombre;
    private String nombreUsuario;
    private String email;
    private String Password;
    private Set<String> roles = new HashSet<>();
    
    
}
