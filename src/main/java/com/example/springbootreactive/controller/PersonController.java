package com.example.springbootreactive.controller;

import com.example.springbootreactive.domain.Person;
import com.example.springbootreactive.repository.PersonRepository;
import org.bson.types.ObjectId;
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

    @GetMapping("/persons/id/{personId}")
    public Mono<Person> getOnePerson(@PathVariable("personId") String personId){
        return personRepository.findById(new ObjectId(personId));
    }

    @PostMapping("/persons")
    public Mono<Person> addPerson(@RequestBody Person person){
        return personRepository.save(person);
    }

    @GetMapping("/persons/age/{age}")
    public Flux<Person> getAllPersonsByAge(@PathVariable("age") int age){
        return personRepository.findByPersonAge(age);
    }

    @DeleteMapping("/persons/{personId}")
    public void deletePerson(@PathVariable String personId){
        ObjectId objectId = new ObjectId(personId);
        personRepository.deleteById(objectId);
    }
}
