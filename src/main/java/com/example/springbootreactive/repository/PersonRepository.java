package com.example.springbootreactive.repository;

import com.example.springbootreactive.domain.Person;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonRepository extends ReactiveCrudRepository<Person,ObjectId> {

//    Mono<Person> findByPersonId(String id);

    Flux<Person> findByPersonAge(int age);
}
