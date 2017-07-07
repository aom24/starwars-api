package com.starwars.rest;

import com.starwars.model.Film;
import com.starwars.model.Planet;
import com.starwars.usecase.film.FindAllFilms;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RequestMapping(path = "/films")
@Controller
@AllArgsConstructor
public class FilmsController {

    private FindAllFilms findAllFilms;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Film>> findAll() {
        List<Film> films = findAllFilms.execute();
        films.forEach((Film f) -> {
            f.getPlanets().forEach((Planet p) -> {
                p.add(linkTo(methodOn(PlanetController.class).findById(p.getPlanetId())).withSelfRel());
            });
        });

        return new ResponseEntity<List<Film>>(films, HttpStatus.OK);
    }

}
