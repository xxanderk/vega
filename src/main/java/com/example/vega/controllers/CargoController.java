package com.example.vega.controllers;

import com.example.vega.models.Cargo;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.vega.services.CargoService;

import java.util.List;

@RestController
@RequestMapping("/cargo")
@CrossOrigin(origins = "http://localhost:5173")
public class CargoController {
    @Autowired
    private CargoService service;

    @GetMapping("/todos")
    public ResponseEntity<List<Cargo>> obtenerTodos() {
        List<Cargo> cargos = service.findAll();

        return ResponseEntity.ok(cargos);
    }
}

