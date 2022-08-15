package com.portfolio.palmieriguillermo.Repository;

import com.portfolio.palmieriguillermo.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository  extends JpaRepository<Persona,Long>{
    
}
