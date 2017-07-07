package com.starwars.usecase.planet;

import com.starwars.model.Planet;
import com.starwars.repository.PlanetRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
@RequiredArgsConstructor
public class FindPlanet {
    @NonNull private PlanetRepository planetRepository;

    public Planet execute(Long id) throws NullPointerException {
        if(id == null) throw new NullPointerException("Planet id is required");

        return planetRepository.findOne(id);
    }
}
