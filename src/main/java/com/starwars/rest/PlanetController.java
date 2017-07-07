package com.starwars.rest;

import com.starwars.model.Planet;
import com.starwars.usecase.planet.FindAllPlanets;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class PlanetController {

    private FindAllPlanets findAllPlanets;

    public PlanetController(FindAllPlanets findAllPlanets) {
        this.findAllPlanets = findAllPlanets;
    }

    @GetMapping(path = "/planets")
    public ResponseEntity<List<Planet>> findAll() {
        List<Planet> planets = findAllPlanets.execute();

        return new ResponseEntity<List<Planet>>(planets, HttpStatus.OK);
    }

}
