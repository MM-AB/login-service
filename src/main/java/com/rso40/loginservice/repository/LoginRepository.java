package com.rso40.loginservice.repository;

import com.rso40.loginservice.model.Login;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoginRepository extends MongoRepository<Login, String> {
}
