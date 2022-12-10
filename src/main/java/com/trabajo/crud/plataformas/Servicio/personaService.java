package com.trabajo.crud.plataformas.Servicio;

import java.util.List;

import com.trabajo.crud.plataformas.dominio.persona;

public interface personaService {
    
    public List<persona> listarpersonas();

    public void guardar(persona persona);

    public void eliminar(persona persona);

    public persona encontrar_persona(persona persona);
}
