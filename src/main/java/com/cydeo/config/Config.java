package com.cydeo.config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class Config {

    @Bean
    public Faker getFaker(){
        return new Faker();
    }

    @Bean
    public Random getRandom(){
        return new Random();
    }
}
