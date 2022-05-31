package com.example.demo.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.v3.core.util.Yaml;
import io.swagger.v3.oas.models.OpenAPI;

/**
 * Configuration for Swagger UI.
 */
@Configuration(proxyBeanMethods = false)
class OpenApiConfig {

    @Value("classpath:/api.yaml")
    private Resource apiSpec;

    @Bean
    public OpenAPI openApi() throws IOException {
        ObjectMapper objectMapper = Yaml.mapper();

        return objectMapper.readValue(apiSpec.getFile(), OpenAPI.class);
    }
}
