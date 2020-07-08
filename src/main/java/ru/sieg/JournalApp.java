package ru.sieg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@SpringBootApplication
@EnableJpaRepositories("ru.sieg.repository")
public class JournalApp extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(JournalApp.class, args);
    }
}
