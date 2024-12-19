package org.example.reto_aws.infrastruture.configution;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.example.reto_aws.aplication.constants.ValidationConstants.*;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title(PEOPLE_API)
                        .description(RESTAURANTS_API)
                        .version(VERSION)
                        .license(new License().name(APACHE).url(HTTP_SPRINGDOC)))
                .externalDocs(new ExternalDocumentation()
                        .description(ADDITIONAL_DOCUMENTATION)
                        .url(EXAMPLE_COM));
    }
}
