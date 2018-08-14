package com.example.springbootreactive.repository;

import com.example.springbootreactive.domain.PageContent;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PageContentRepository extends ReactiveMongoRepository<PageContent,String> {
}
