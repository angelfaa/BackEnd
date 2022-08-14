
package com.portfolio.faf.Repository;

import com.portfolio.faf.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository  extends JpaRepository<Persona,Long>{
    
}
