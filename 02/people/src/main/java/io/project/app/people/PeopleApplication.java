package io.project.app.people;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "io.project.app.people.repositories")
@EntityScan("io.project.app.people.domain")
public class PeopleApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeopleApplication.class, args);
    }

}
