package com.starwars.usecase.film;

import com.starwars.repository.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
@RequiredArgsConstructor
public class DeleteFilm {
    @NotNull private FilmRepository filmRepository;

    public void execute(Long id) throws NullPointerException {
        if(id == null) throw new NullPointerException("Film id is required");

        filmRepository.delete(id);
    }
}
