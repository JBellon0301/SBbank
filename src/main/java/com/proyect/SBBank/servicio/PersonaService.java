package com.proyect.SBBank.servicio;

import com.proyect.SBBank.domain.Persona;
import java.util.List;



public interface PersonaService {
    
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);

    public Persona encontrarPersonaPorID(Long id_persona);
    
}
