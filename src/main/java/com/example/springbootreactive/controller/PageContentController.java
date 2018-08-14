package com.example.springbootreactive.controller;

import com.example.springbootreactive.domain.PageContent;
import com.example.springbootreactive.repository.PageContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class PageContentController {

    @Autowired
    PageContentRepository pageContentRepository;

    @PostMapping("/contents")
    public Mono<PageContent> savePageContents(@RequestBody PageContent content){
        return pageContentRepository.save(content);
    }
}
