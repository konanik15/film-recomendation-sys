package pl.agh.edu.recomendationsystem.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.agh.edu.recomendationsystem.model.User;
import pl.agh.edu.recomendationsystem.repositiories.UserRepositiory;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(UserRepositiory repositiory) {
        return args -> {
            log.info("Preloading " + repositiory.save(new User("Franek")));
            log.info("Preloading " + repositiory.save(new User("Dawid")));
        };
    }
}
