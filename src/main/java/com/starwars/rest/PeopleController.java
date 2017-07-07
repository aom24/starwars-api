package com.starwars.rest;

import com.starwars.model.People;
import com.starwars.usecase.people.FindAllPeople;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping(path = "/people")
@Controller
@AllArgsConstructor
public class PeopleController {

    private FindAllPeople findAllPeople;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<People>> findAll() {
        List<People> people = findAllPeople.execute();

        return new ResponseEntity<List<People>>(people, HttpStatus.OK);
    }

}
