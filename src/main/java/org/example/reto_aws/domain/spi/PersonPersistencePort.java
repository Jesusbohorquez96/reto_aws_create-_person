package org.example.reto_aws.domain.spi;

import org.example.reto_aws.domain.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonPersistencePort {

    void save(Person person);

    Optional<Person> findByIdentification(String identification);

    List<Person> findAll();
}
