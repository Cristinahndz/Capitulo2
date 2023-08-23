package com.sistema.trailers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.dialect.springdata.SpringDataDialect;

@SpringBootApplication
public class MiniSistemaTrailers1Application {

	public static void main(String[] args) {
		SpringApplication.run(MiniSistemaTrailers1Application.class, args);
	}
@Bean
public SpringDataDialect sprinDataDialect() {
	return new SpringDataDialect();
	
}
}
