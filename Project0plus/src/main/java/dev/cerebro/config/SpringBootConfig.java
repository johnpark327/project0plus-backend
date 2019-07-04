package dev.cerebro.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("dev.cerebro") // This annotation scans the entire project for dependency injection.
@EntityScan("dev.cerebro.model")  // This annotation scans for the models, which correspond to the tables in the database.
public class SpringBootConfig {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfig.class, args);
    }
    
}
