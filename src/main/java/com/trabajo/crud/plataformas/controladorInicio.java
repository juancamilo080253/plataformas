package com.trabajo.crud.plataformas;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.trabajo.crud.plataformas.DAO.personaDAO;
import com.trabajo.crud.plataformas.dominio.persona;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j

public class controladorInicio {

    @Autowired //inyectamos la interface de tipoDAO
    private personaDAO personaDAO;

    @GetMapping("/")
    public String inicio(Model model){

        var personas= personaDAO.findAll();
        log.info("EJECUTANDO EL CONTROLADOR MVC");
        model.addAttribute("personas", personas);
        return "index";
    }
}
