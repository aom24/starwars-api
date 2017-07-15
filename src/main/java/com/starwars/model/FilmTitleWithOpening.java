package com.starwars.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "filmTitleWithOpening", types = Film.class)
public interface FilmTitleWithOpening {
    String getTitle();
    String getOpeningCrawl();
    List<PeopleWithNoPersonalInfo> getPeople();
    @Value("Prueba campo nuevo")
    String getPrueba();
}
