package com.docker.test;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Docker Demo API")
                        .description("Bu API demo amaçlı Spring Boot ve Docker içeren bir örnektir.")
                        .version("v1.0.0")
                        .contact(new Contact()
                                .name("Berat Kulcu")
                                .email("klcberat13@gmail.com")
                                .url("https://github.com/beratkulcu"))
                        .license(new License()
                                .name("Docker Test")
                                .url("https://www.apache.org/licenses/LICENSE-2.0.html")));
    }
}
