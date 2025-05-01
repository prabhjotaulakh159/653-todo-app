package prabhjot.adam.internship.prep.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import prabhjot.adam.internship.prep.models.UserModel;

/**
 * Reference documentation: 
 * https://docs.spring.io/spring-data/mongodb/docs/current-SNAPSHOT/reference/html/#mongo.repositories
 * 
 * Authors: Prabhjot Aulakh and Adam Sean Winter
 */
public interface UserRepository extends MongoRepository<UserModel, String> {
}
