package com.udemy.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {
	
	// http://localhost:8080/swagger-ui/index.html
	
	@Bean
	public OpenAPI customOpenPI() {
		return new OpenAPI()
		.info(new Info()
				.title("Restful API with Java 18 and Spring Boot 3")
				.version("v1")
				.description("Some description about your API")
				.termsOfService("https://github.com/AmandaDourado")
				.license(new License().
						name("Apache 2.0")
						.url("https://github.com/AmandaDourado")));	
	}
	
	
}
