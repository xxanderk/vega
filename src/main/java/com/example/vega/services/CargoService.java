package com.example.vega.services;

import com.example.vega.models.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.vega.repository.CargoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService  {
    @Autowired
    private CargoRepository repository;

    public List<Cargo> findAll() {
        return repository.findAll();
    }
}