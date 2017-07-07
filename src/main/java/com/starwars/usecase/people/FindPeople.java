package com.starwars.usecase.people;

import com.starwars.model.People;
import com.starwars.repository.PeopleRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
@RequiredArgsConstructor
public class FindPeople {
    @NotNull private PeopleRepository peopleRepository;

    public People execute(@NonNull Long id) throws NullPointerException {

        return peopleRepository.findOne(id);
    }
}
