package com.adso.proyectitodef.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="personajes")
@Data
public class Personajes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nombre;
    private String descripcion;
    private Integer edad;
}
