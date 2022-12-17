
package com.portfolio.gag.Repository;

import com.portfolio.gag.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer>{
   public Optional<Experiencia> findByPuestoE (String puestoE);
   public boolean existsByPuestoE (String puestoE);
}
