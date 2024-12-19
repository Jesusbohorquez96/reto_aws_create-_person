package org.example.reto_aws.domain.caseUse;

import org.example.reto_aws.aplication.dto.PersonListResponse;
import org.example.reto_aws.aplication.dto.PersonRequest;
import org.example.reto_aws.aplication.dto.PersonResponse;
import org.example.reto_aws.aplication.mapper.PersonMapper;
import org.example.reto_aws.domain.model.Person;
import org.example.reto_aws.domain.spi.PersonPersistencePort;
import org.example.reto_aws.infrastruture.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonUseCase {

    private final PersonPersistencePort personPersistencePort;

    public PersonUseCase(PersonPersistencePort personPersistencePort) {
        this.personPersistencePort = personPersistencePort;
    }

    public PersonResponse guardarPersona(PersonRequest request) {
        Person person = PersonMapper.toDomain(request);
        personPersistencePort.save(person);
        return PersonMapper.toResponse(person);
    }

    public PersonResponse consultarPersona(String identification) {
        Person person = personPersistencePort.findByIdentification(identification)
                .orElseThrow(() -> new ResourceNotFoundException("Persona no encontrada"));
        return PersonMapper.toResponse(person);
    }

    public PersonListResponse consultarPersonas() {
        List<Person> persons = personPersistencePort.findAll();
        return new PersonListResponse(
                PersonMapper.toResponseList(persons)
        );
    }
}
