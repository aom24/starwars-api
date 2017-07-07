package com.starwars.usecase.film;

import com.starwars.model.Film;
import com.starwars.repository.FilmRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
@RequiredArgsConstructor
public class FindFilm {
    @NonNull private FilmRepository filmRepository;

    public Film execute(Long id) throws NullPointerException {
        if(id == null) throw new NullPointerException("Film id is required");

        return filmRepository.findOne(id);
    }
}
