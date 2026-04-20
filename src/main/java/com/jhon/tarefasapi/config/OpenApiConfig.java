package com.jhon.tarefasapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("API de Tarefas")
                        .description("API para gerenciamento de tarefas")
                        .version("1.0"));
    }
}
