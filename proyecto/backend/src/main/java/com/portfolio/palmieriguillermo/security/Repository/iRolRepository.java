
package com.portfolio.palmieriguillermo.security.Repository;

import com.portfolio.palmieriguillermo.security.Entity.Rol;
import com.portfolio.palmieriguillermo.security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
   Optional<Rol> findByRolNombre(RolNombre rolNombre); 
}
