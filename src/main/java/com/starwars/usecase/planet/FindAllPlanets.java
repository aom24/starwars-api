package com.starwars.usecase.planet;

import com.starwars.model.Planet;
import com.starwars.repository.PlanetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FindAllPlanets {
    @NotNull private PlanetRepository planetRepository;

    public List<Planet> execute() {

        return planetRepository.findAll();
    }
}
