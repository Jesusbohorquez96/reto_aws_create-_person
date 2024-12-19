package org.example.reto_aws.aplication.dto;

import lombok.*;
import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonRequest {

    @NotBlank(message = "Name is required.")
    @Size(min = 3, message = "Name must be at least 3 characters.")
    private String name;

    @NotBlank(message = "Email is required.")
    @Email(message = "Email format is invalid.")
    private String email;

    @NotBlank(message = "The identification number is required.")
    private String identification;
}
