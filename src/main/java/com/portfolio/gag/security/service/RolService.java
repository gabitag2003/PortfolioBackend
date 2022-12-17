
package com.portfolio.gag.security.service;


import com.portfolio.gag.security.entity.Rol;
import com.portfolio.gag.security.enums.RolNombre;
import com.portfolio.gag.security.repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional  // Asegurar la persistencia. 
public class RolService {
    @Autowired
    iRolRepository  irolRepository;
    
    public Optional<Rol> getByRolNombre( RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
            }
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
