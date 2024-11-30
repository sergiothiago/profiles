package com.profiles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Controller
public class AppConfig {


    @Bean
    @Profile("local")
    public String localBean(){
        return "Est� rodando a profile Local!";
    }

    @Bean
    @Profile("dev")
    public String devBean(){
        return "Est� rodando a profile dev!";
    }
}
