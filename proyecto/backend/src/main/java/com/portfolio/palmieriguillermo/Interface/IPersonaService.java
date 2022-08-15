package com.portfolio.palmieriguillermo.Interface;

import com.portfolio.palmieriguillermo.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guarda un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un ojeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
