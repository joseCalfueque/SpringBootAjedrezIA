package com.ufro.AjedrezIA.controller;

import com.ufro.AjedrezIA.entidad.Tablero;
import com.ufro.AjedrezIA.servicio.TableroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/api/tablero")
    public class TableroController {
        @Autowired
        private TableroService service;

        @GetMapping
        public List<Tablero> obtenerTableros() { return service.listar(); }

        @PostMapping
        public Tablero crearTablero(@RequestBody Tablero tablero) { return service.guardar(tablero); }
    }



