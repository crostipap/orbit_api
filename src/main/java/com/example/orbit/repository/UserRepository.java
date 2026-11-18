package com.example.orbit.repository;

import java.util.Optional;

import com.example.orbit.models.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserModel, String> {

    Optional<UserModel> findByKeycloakId(String keycloakId);
}
