package com.starwars.usecase.people;

import com.starwars.repository.PeopleRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
@RequiredArgsConstructor
public class DeletePeople {
    @NonNull private PeopleRepository peopleRepository;

    public void execute(Long id) throws NullPointerException {
        if(id == null) throw new NullPointerException("People id is required");

        peopleRepository.delete(id);
    }
}
