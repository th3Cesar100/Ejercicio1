package com.claro.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cl_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private long id;


    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "correo_electronico", length = 50)
    private String correoElectronico;

    @Column(name = "sexo", length = 1)
    private String sexo;

    @OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Hobbie> hobbies =  new ArrayList<>();
}
