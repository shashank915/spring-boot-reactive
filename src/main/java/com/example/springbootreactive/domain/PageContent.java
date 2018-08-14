package com.example.springbootreactive.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Document
@Data
public class PageContent {

    @Id
    private String pageContentId = UUID.randomUUID().toString();

    private List<ContentParts> contents;
}
