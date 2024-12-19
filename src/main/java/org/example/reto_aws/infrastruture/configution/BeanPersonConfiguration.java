package org.example.reto_aws.infrastruture.configution;


import lombok.RequiredArgsConstructor;
import org.example.reto_aws.domain.caseUse.PersonUseCase;
import org.example.reto_aws.domain.spi.PersonPersistencePort;
import org.example.reto_aws.infrastruture.output.jpa.PersonRepositoryAdapter;
import org.example.reto_aws.infrastruture.output.repository.PersonRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanPersonConfiguration {

    private final PersonRepository personRepository;

    @Bean
    public PersonPersistencePort personPersistencePort() {
        return new PersonRepositoryAdapter(personRepository);
    }

    @Bean
    public PersonUseCase personUseCase(PersonPersistencePort personPersistencePort) {
        return new PersonUseCase(personPersistencePort);
    }
}
