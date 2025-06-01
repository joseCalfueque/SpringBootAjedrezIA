package com.ufro.AjedrezIA.entidad;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Tablero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String estado;

    public Tablero(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public Long getId() {
        return id;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
