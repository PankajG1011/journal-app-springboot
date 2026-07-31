package com.pankaj.journalApp.service;


import com.pankaj.journalApp.entity.JournalEntry;
import com.pankaj.journalApp.entity.User;
import com.pankaj.journalApp.repository.JournalEntryRepo;
import com.pankaj.journalApp.repository.UserRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public void saveEntry(User user){
            userRepo.save(user);

    }

    public List<User>getAll(){
        return userRepo.findAll();
    }

    public Optional<User> findById(ObjectId id){
        return userRepo.findById(id);
    }

    public void deleteById(ObjectId id){
        userRepo.deleteById(id);
    }

    public User findByUserName(String userName){
        return userRepo.findByUserName(userName);
    }

}


//controller ---> service ---> repository