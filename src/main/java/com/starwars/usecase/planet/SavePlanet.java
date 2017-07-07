package com.starwars.usecase.planet;

import com.starwars.model.Planet;
import com.starwars.repository.PlanetRepository;
import org.springframework.stereotype.Service;

@Service
public class SavePlanet {
    private PlanetRepository planetRepository;

    public SavePlanet(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    public Planet execute(Planet planet) throws NullPointerException {
        if(planet == null) throw new NullPointerException("planet is null");

        return planetRepository.save(planet);
    }
}
