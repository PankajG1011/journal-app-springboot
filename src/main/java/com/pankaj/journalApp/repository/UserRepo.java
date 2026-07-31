package com.pankaj.journalApp.repository;

import com.pankaj.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, ObjectId> {
    User findByUserName(String username);

}
