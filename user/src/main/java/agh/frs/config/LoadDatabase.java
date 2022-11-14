package agh.frs.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    //Adding 2 users at the start of program

//    @Bean
//    CommandLineRunner initDatabase(UserRepository repositiory) {
//        return args -> {
//            log.info("Preloading " + repositiory.save(new User("Franek")));
//            log.info("Preloading " + repositiory.save(new User("Dawid")));
//        };
//    }
}
