package com.trabajo.crud.plataformas;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.trabajo.crud.plataformas.dominio.persona;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j

public class controladorInicio {

    @GetMapping("/")
    public String inicio(Model model){
        var mensaje="ADIOS CON THYMELEAF";

        var persona = new persona();
        persona.setNombre("Camilo");
        persona.setApellido("Gomez");
        persona.setTelefono("3012844505");
        persona.setEmail("juan@hot.com");

        var persona2 = new persona();
        persona2.setNombre("Karla");
        persona2.setApellido("Gomez");
        persona2.setTelefono("30125445505");
        persona2.setEmail("karla23@hot.com");

        // var personas = new ArrayList<>();
        // personas.add(persona);
        // personas.add(persona2);

        var personas = Arrays.asList(persona,persona2);

        log.info("EJECUTANDO EL CONTROLADOR MVC");
        model.addAttribute("mensaje", mensaje);
        //model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        return "index";
    }
}
