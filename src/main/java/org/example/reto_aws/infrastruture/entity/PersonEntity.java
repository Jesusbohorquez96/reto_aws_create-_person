package org.example.reto_aws.infrastruture.entity;

import lombok.*;
import org.example.reto_aws.aplication.dto.PersonResponse;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.util.List;

import static org.example.reto_aws.aplication.constants.ValidationConstants.*;

@Entity
@Table (name = "person")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = IDENTIFICATION_REQUIRED)
    @Column(name = IDENTIFICATION_NUMBER, unique = true, nullable = false, length = TWENTY)
    private String identification;

    @NotBlank(message = NAME_REQUIRED)
    @Size(min = THERE, message = NAME_MIN_SIZE)
    @Column(name = NAME, nullable = false, length = ONEHUNDRED)
    private String name;

    @NotBlank(message = EMAIL_REQUIRED)
    @Email(message = EMAIL_FORMAT)
    @Column(name = EMAIL, nullable = false, unique = true, length = ONEHUNDRED_FIFTY)
    private String email;

    public PersonEntity(String name, String email, String identification) {
        this.name = name;
        this.email = email;
        this.identification = identification;
    }
}
