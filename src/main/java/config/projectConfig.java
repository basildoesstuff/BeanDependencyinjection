package config;

import MyBean.pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "MyBean")
public class projectConfig {
    @Bean
    pet parrot(){
     pet p = new pet();
     p.setName("Tommy");
     return p;
    }
}

