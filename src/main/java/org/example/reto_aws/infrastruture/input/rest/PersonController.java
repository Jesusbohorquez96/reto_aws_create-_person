package org.example.reto_aws.infrastruture.input.rest;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.example.reto_aws.aplication.dto.PersonListResponse;
import org.example.reto_aws.aplication.dto.PersonRequest;
import org.example.reto_aws.aplication.dto.PersonResponse;
import org.example.reto_aws.domain.caseUse.PersonUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.example.reto_aws.aplication.constants.ValidationConstants.*;

@RestController
@RequestMapping("/api/personas")
@RequiredArgsConstructor
public class PersonController {

    private final PersonUseCase personUseCase;

    @Operation(summary = SAVE_PERSON, description = CREATE_PERSON_SYSTEM)
    @PostMapping
    public ResponseEntity<PersonResponse> guardarPersona(@Valid @RequestBody PersonRequest request) {
        PersonResponse response = personUseCase.guardarPersona(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
    @Operation(summary = "Consulter una persona", description = "Obtiene los datos de una persona por su identificación")
    @GetMapping("/{identification}")
    public ResponseEntity<PersonResponse> consultarPersona(@PathVariable String identification) {
        PersonResponse response = personUseCase.consultarPersona(identification);
        return ResponseEntity.ok(response);
    }

    @Operation(summary = "Consultar todas las personas", description = "Obtiene los datos de todas las personas")
    @GetMapping
    public ResponseEntity<PersonListResponse> consultarPersonas() {
        PersonListResponse response = personUseCase.consultarPersonas();
        return ResponseEntity.ok(response);
    }
}