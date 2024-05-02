package com.thl.CRUD.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tablaPersona")

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String ocupacion;

}
