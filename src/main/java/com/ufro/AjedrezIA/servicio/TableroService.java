package com.ufro.AjedrezIA.servicio;

import com.ufro.AjedrezIA.entidad.Tablero;
import com.ufro.AjedrezIA.repositorio.TableroRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TableroService {

    @Autowired
    private TableroRepository repositorio;
    public List<Tablero> listar() { return repositorio.findAll(); }
    public Tablero guardar(Tablero t) { return repositorio.save(t); }
}

