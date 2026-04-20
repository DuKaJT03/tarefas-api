package com.jhon.tarefasapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.jhon.tarefasapi.repository")
public class TarefasapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TarefasapiApplication.class, args);
	}

}
