package com.example.springbootreactive.repository;

import com.example.springbootreactive.domain.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface PersonRepository extends ReactiveMongoRepository<Person,String> {

    Mono<Person> findByPersonId(String id);
}
