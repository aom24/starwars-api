package com.starwars.usecase.people;

import com.starwars.model.People;
import com.starwars.repository.PeopleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

@Service
public class FindAllPeople {
    private PeopleRepository peopleRepository;

    public FindAllPeople(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public List<People> execute() {

        return peopleRepository.findAll();
    }
}
