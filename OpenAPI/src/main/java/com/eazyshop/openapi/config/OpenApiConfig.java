package com.eazyshop.openapi.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI(){
        ArrayList<Tag> tags = new ArrayList<>();
        Tag tag = new Tag();
        tag.setName("Category");
        tags.add(tag);
        return new OpenAPI()
                .info(new Info().title("Eazy Shop API")
                        .description("EazyShop sample application")
                        .version("v0.0.1")
                        .contact(new Contact()
                                .name("Eazy Shop")
                                .email("support@eazyshop.com")
                                .url("www.eazyshop.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("EazeShop Wiki Documentation")
                        .url("https://eazyshop.wiki.github.org/docs"))
                .tags(tags);
    }

}
