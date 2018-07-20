package com.example.springbootreactive.controller;

import com.example.springbootreactive.domain.Person;
import com.example.springbootreactive.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/persons")
    public Flux<Person> getAllPersons(){
        return personRepository.findAll();
    }

    @GetMapping("/persons/{personId}")
    public Mono<Person> getOnePerson(@PathVariable("personId") String personId){
        return personRepository.findByPersonId(personId);
    }

    @PostMapping("/persons")
    public Mono<Person> addPerson(@RequestBody Person person){
        return personRepository.insert(person);
    }

}
