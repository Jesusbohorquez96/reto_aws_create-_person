package org.example.reto_aws.aplication.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonListResponse {

    private List<PersonResponse> persons;
}
