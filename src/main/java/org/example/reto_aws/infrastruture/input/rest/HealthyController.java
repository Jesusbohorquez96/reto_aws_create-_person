package org.example.reto_aws.infrastruture.input.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthy")
@RequiredArgsConstructor
public class HealthyController {

    @GetMapping
    public ResponseEntity<String> healthy() {
        return ResponseEntity.ok("Healthy");
    }
}
