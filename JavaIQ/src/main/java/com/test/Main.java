package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.test.test05", "com.test.test03.config"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}