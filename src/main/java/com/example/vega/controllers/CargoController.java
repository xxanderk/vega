package com.example.vega.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cargo")
@CrossOrigin(origins = "http://localhost:5173")
public class CargoController {
    @Autowired
    private CargoService cargoService;

    @GetMapping("/{id}")
    public ResponseEntity<CargoDto> obtenerPorId(@PathVariable id) {
        Optional<CargoDto> cargoOpt = service.findById(id);

        if (cargoOpt.isPresent()) {
            return ResponseEntity.ok(cargoOpt.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }
}

