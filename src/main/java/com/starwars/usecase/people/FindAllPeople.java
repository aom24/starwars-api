package com.starwars.usecase.people;

import com.starwars.model.People;
import com.starwars.repository.PeopleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FindAllPeople {
    @NotNull private PeopleRepository peopleRepository;

    public List<People> execute() {

        return peopleRepository.findAll();
    }
}
