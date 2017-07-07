package com.starwars.usecase.people;

import com.starwars.model.People;
import com.starwars.repository.PeopleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
@RequiredArgsConstructor
public class FindPeople {
    @NotNull private PeopleRepository peopleRepository;

    public People execute(Long id) throws NullPointerException {
        if(id == null) throw new NullPointerException("People id is required");

        return peopleRepository.findOne(id);
    }
}
