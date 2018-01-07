package com.SpELparent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class SimpleConfig {

    private String prop = "Prop Field";
    private String name = "Name Field";

    @Bean
    public ExtendedMachine extendedMachine(){
        return new ExtendedMachine(prop, name);
    }

    @Bean
    public Machine machine(){
        return new Machine(prop);
    }

}
