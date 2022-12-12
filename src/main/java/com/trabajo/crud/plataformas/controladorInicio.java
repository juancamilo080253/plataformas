package com.trabajo.crud.plataformas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.trabajo.crud.plataformas.Servicio.personaService;
import com.trabajo.crud.plataformas.dominio.persona;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j

public class controladorInicio {

    @Autowired //inyectamos la interface de tipoDAO
    private personaService personaService;  

    @GetMapping("/")
    public String inicio(Model model){

        var personas= personaService.listarpersonas();
        log.info("EJECUTANDO EL CONTROLADOR MVC");
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(persona persona){
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(persona persona){
        personaService.guardar(persona);
        return "redirect:/";
    }

    @GetMapping("/editar/{id_persona}")
    public String editar(persona persona, Model model){
        persona = personaService.encontrar_persona(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }

    @GetMapping("/eliminar/{id_persona}")
    public String eliminar(persona persona){
        personaService.eliminar(persona);
        return "redirect:/";
    }
}
