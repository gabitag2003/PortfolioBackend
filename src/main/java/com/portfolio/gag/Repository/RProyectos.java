/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.gag.Repository;

import com.portfolio.gag.Entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface RProyectos extends JpaRepository <Proyectos , Integer> {
    // médtodo que busca por nombre, llama a la entidad Proyectos
    public Optional<Proyectos> findBynombreP(String nombreP); 
    //booleano que coteja si existe ese nombre, devuelve v o f
    public boolean existsBynombreP (String nombreP);
    
}
