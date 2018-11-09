package com.alsoft.pool.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.alsoft.pool.domain.Creator;

public interface CreatorRepository extends MongoRepository<Creator, String> {

}
