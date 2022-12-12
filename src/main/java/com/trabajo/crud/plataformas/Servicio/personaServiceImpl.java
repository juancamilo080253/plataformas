package com.trabajo.crud.plataformas.Servicio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trabajo.crud.plataformas.DAO.personaDAO;
import com.trabajo.crud.plataformas.dominio.persona;

@Service
public class personaServiceImpl implements personaService{

    @Autowired
    private personaDAO personaDAO;

    @Override
    @Transactional(readOnly = true)
    public List<persona> listarpersonas() {
        return (List<persona>) personaDAO.findAll();
    }

    @Override
    @Transactional
    public void guardar(persona persona) {
       personaDAO.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(persona persona) {
        personaDAO.delete(persona);
        
    }

    @Override
    @Transactional(readOnly = true)
    public persona encontrar_persona(persona persona) {
        return personaDAO.findById(persona.getId_persona()).orElse(null);        
    }

}
