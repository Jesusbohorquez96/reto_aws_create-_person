package org.example.reto_aws.infrastruture.output.jpa;

import lombok.RequiredArgsConstructor;
import org.example.reto_aws.aplication.mapper.PersonMapper;
import org.example.reto_aws.domain.model.Person;
import org.example.reto_aws.domain.spi.PersonPersistencePort;
import org.example.reto_aws.infrastruture.entity.PersonEntity;
import org.example.reto_aws.infrastruture.output.repository.PersonRepository;

import java.util.*;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class PersonRepositoryAdapter implements PersonPersistencePort {

    private final PersonRepository personRepository;

    @Override
    public void save(Person person) {
        PersonEntity entity = PersonMapper.toEntity(person);
        personRepository.save(entity);
    }

    @Override
    public Optional<Person> findByIdentification(String identification) {
        return personRepository.findByIdentification(identification)
                .map(PersonMapper::toDomain);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll().stream()
                .map(PersonMapper::toDomain)
                .collect(Collectors.toList());
    }
}
