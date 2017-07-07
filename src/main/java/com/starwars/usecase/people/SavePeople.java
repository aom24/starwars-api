package com.starwars.usecase.people;

import com.starwars.model.People;
import com.starwars.repository.PeopleRepository;
import org.springframework.stereotype.Service;

@Service
public class SavePeople {
    private PeopleRepository peopleRepository;

    public SavePeople(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public People execute(People people) throws NullPointerException {
        if(people == null) throw new NullPointerException("people is null");

        return peopleRepository.save(people);
    }
}
