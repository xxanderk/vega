package com.example.vega.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_CARGOS")
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String last_Name;

    @Column(name = "age")
    private Integer age;
}
