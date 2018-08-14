package com.example.springbootreactive.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Person {

    @Id
    private ObjectId personId;
    private String personName;
    private int personAge;
}
