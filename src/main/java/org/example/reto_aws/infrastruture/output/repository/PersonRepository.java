package org.example.reto_aws.infrastruture.output.repository;

import org.example.reto_aws.infrastruture.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {

    Optional<PersonEntity> findByIdentification(String identification);
}
