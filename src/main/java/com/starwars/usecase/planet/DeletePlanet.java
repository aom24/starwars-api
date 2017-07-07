package com.starwars.usecase.planet;

import com.starwars.repository.PlanetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
@RequiredArgsConstructor
public class DeletePlanet {
    @NotNull private PlanetRepository planetRepository;

    public void execute(Long id) throws NullPointerException {
        if(id == null) throw new NullPointerException("Planet id is required");

        planetRepository.delete(id);
    }
}
