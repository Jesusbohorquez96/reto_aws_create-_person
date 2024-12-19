package org.example.reto_aws.aplication.mapper;

import org.example.reto_aws.aplication.dto.PersonRequest;
import org.example.reto_aws.aplication.dto.PersonResponse;
import org.example.reto_aws.domain.model.Person;
import org.example.reto_aws.infrastruture.entity.PersonEntity;

import java.util.List;
import java.util.stream.Collectors;

public class PersonMapper {

    public static Person toDomain(PersonRequest request) {
        return new Person(request.getName(), request.getEmail(), request.getIdentification());
    }

    public static PersonEntity toEntity(Person person) {
        return new PersonEntity(person.getName(), person.getEmail(), person.getIdentification());
    }

    public static Person toDomain(PersonEntity entity) {
        return new Person(entity.getName(), entity.getEmail(), entity.getIdentification());
    }

    public static PersonResponse toResponse(Person person) {
        return new PersonResponse(person.getName(), person.getEmail(), person.getIdentification());
    }

    public static List<PersonResponse> toResponseList(List<Person> persons) {
        return persons.stream()
                .map(PersonMapper::toResponse)
                .collect(Collectors.toList());
    }
}
