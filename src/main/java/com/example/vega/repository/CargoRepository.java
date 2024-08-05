package com.example.vega.repository;

import ch.qos.logback.core.model.Model;
import com.example.vega.models.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CargoRepository extends JpaRepository <Cargo, Integer> {

}
