package com.starwars.usecase.film;

import com.starwars.model.Film;
import com.starwars.model.People;
import com.starwars.model.Planet;
import com.starwars.repository.PlanetRepository;
import com.starwars.repository.FilmRepository;
import com.starwars.repository.PeopleRepository;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SaveFilm {
    private FilmRepository filmRepository;
    private PeopleRepository peopleRepository;
    private PlanetRepository planetRepository;

    public SaveFilm(FilmRepository filmRepository, PeopleRepository peopleRepository, PlanetRepository planetRepository) {
        this.filmRepository = filmRepository;
        this.peopleRepository = peopleRepository;
        this.planetRepository = planetRepository;
    }

    public Film execute(@NonNull Film film) throws NullPointerException {

        film.getPlanets().forEach((Planet p) -> {
            if(!planetRepository.exists(p.getPlanetId())) {
                planetRepository.save(p);
            }
        });

        film.getPeople().forEach((People p) -> {
            if(!peopleRepository.exists(p.getPeopleId())) {
                peopleRepository.save(p);
            }
        });

        return filmRepository.save(film);
    }
}
