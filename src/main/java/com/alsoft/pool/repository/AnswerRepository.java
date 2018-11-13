package com.alsoft.pool.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.alsoft.pool.domain.Answer;

public interface AnswerRepository extends MongoRepository<Answer, String> {

}
