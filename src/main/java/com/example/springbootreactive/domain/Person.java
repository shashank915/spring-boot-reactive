package com.example.springbootreactive.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Person {
    private String personId = UUID.randomUUID().toString();
    private String personName;
    private int personAge;
}
