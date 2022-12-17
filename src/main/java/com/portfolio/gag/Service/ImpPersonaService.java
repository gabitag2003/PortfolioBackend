
package com.portfolio.gag.Service;

import com.portfolio.gag.Entity.Persona;
import com.portfolio.gag.Repository.IPersonaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class ImpPersonaService {
 @Autowired IPersonaRepository ipersonaRepository;

 //Trae la lista de all experiencias
    
public List<Persona> list(){
 return ipersonaRepository.findAll();
          
}


//método getOne es de Jparepository   
public Optional <Persona> getOne(int id){
return ipersonaRepository.findById(id); 
}
        
public Optional <Persona> getByNombre(String nombre){
return ipersonaRepository.findByNombre(nombre);
}

 public void save (Persona persona) {
      ipersonaRepository.save (persona);
}
 
 public void delete (int id){
        ipersonaRepository.deleteById(id);
}
    
public boolean existsById (int id){
return ipersonaRepository.existsById(id);
}

public boolean existsByNombre (String nombre){
return ipersonaRepository.existsByNombre(nombre);
} 

  
}
