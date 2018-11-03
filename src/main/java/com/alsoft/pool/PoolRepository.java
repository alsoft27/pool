package com.alsoft.pool;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.alsoft.pool.domain.Pool;

public interface PoolRepository extends MongoRepository<Pool, String> {

}
