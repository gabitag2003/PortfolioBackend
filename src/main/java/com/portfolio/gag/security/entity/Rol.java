package com.portfolio.gag.security.entity;

import com.portfolio.gag.security.enums.RolNombre;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter  


@Entity
public class Rol {
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Enumerated (EnumType.STRING) //ANOTATIONS QUE DETERMINA LOS VALORES Q INGRESAREMOS EN EL CAMPO rolNombre. Seran letras y números
    private RolNombre rolNombre;

    public Rol(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }

    public Rol() {
    }
    
    
}
