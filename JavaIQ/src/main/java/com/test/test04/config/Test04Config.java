package com.test.test04.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Test04Config {

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
