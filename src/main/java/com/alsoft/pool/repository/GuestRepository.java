package com.alsoft.pool.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.alsoft.pool.domain.Guest;

public interface GuestRepository extends MongoRepository<Guest, String> {

}
