package com.raczkowski.entity.other;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {


    public Main() {
    }

    public static void main(String[] args) {
        SpringApplication.run(com.raczkowski.entity.other.Main.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return (args) -> {

        };
    }

}
