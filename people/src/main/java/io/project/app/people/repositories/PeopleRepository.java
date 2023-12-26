package io.project.app.people.repositories;

import io.project.app.people.domain.People;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends MongoRepository<People, String> {

    List<People> findTop50ByOrderByIdDesc();

}
