package io.project.app.people.repositories;


import io.project.app.people.domain.People;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends MongoRepository<People, String> {


}
