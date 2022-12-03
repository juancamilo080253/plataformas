package com.trabajo.crud.plataformas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controladorInicio {
    
    @GetMapping("/")
    public String inicio(){
        return "Hola amor mio corazon de otro";
    }
}
