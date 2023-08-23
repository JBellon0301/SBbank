package com.proyect.SBBank.servicio;

import com.proyect.SBBank.Dao.PersonaDao;
import com.proyect.SBBank.domain.Persona;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaDao personaDao;
    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        if (persona.getId_persona() == null){
            persona.setCreated_at(new Timestamp(System.currentTimeMillis()));
        }else{
            //Si el Id es nulo, es tomado como nuevo usuario
            persona.setUpdated_at(new Timestamp(System.currentTimeMillis()));
        }
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
        return personaDao.findById(persona.getId_persona()).orElse(null);
    }

    @Override
    public Persona encontrarPersonaPorID(Long id_persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
