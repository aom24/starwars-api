package com.starwars.usecase.film;

import com.starwars.model.Film;
import com.starwars.repository.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FindAllFilms {
    @NotNull private FilmRepository filmRepository;

    public List<Film> execute() {

        return filmRepository.findAll();
    }
}
