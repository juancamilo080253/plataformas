package com.trabajo.crud.plataformas.dominio;

import java.io.Serializable;

import javax.persistence.*;


import lombok.Data;

@Data
@Entity
@Table(name = "persona") //se usa en caso de sensibilidad de S.O
public class persona implements Serializable{

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    
}
