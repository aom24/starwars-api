package com.starwars.repository;

import com.starwars.model.Film;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomFilmRepository {
 void logFilm(Film film);
}
