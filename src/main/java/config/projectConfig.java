package config;

import MyBean.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class projectConfig {
    @Bean(name = "Tommy")
    Pet pet1(){
     Pet p = new Pet();
     p.setName("Tommy");
     return p;
    }
    @Bean(name= "Brian")
    Pet pet2(){
        Pet p = new Pet();
        p.setName("Brian");
        return p;
    }
}

