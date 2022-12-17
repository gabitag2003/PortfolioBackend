
package com.portfolio.gag.Service;

import com.portfolio.gag.Entity.Experiencia;
import com.portfolio.gag.Repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional // Mantiene la persistencia, impacta en base de datos
public class SExperiencia {
   //Injectamos el repositorio  
@Autowired 
RExperiencia rExperiencia; 

//Trae la lista de all experiencias
    
public List<Experiencia> list(){
 return rExperiencia.findAll();
          
}


//método getOne es de Jparepository   
public Optional <Experiencia> getOne(int id){
return rExperiencia.findById(id); 
}
        
public Optional <Experiencia> getByPuestoE (String puestoE){
return rExperiencia.findByPuestoE(puestoE);
}

 public void save (Experiencia expe) {
        rExperiencia.save (expe);
}
 
 public void delete (int id){
        rExperiencia.deleteById(id);
}
    
public boolean existsById (int id){
return rExperiencia.existsById(id);
}

public boolean existsByPuestoE (String puestoE){
return rExperiencia.existsByPuestoE(puestoE);
} 



}
