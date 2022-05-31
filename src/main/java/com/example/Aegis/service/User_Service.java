package com.example.Aegis.service;
import com.example.Aegis.domain.User;
import com.example.Aegis.domain.User_Role;
import com.example.Aegis.repository.User_Repo;
import com.example.Aegis.repository.User_Role_Repo;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User_Service {

    @Autowired
    private User_Role_Repo repo1;

    public List<User_Role> listAll1(){
        return (List<User_Role>) repo1.findAll();
    }

    @Autowired
    private User_Repo repo;

    public User_Service(User_Repo repo) {
        this.repo = repo;
    }

    public void delete(long id) {
        repo.deleteById(id);
    }

    public List<User> listAll() {

        return (List<User>) repo.findAll();
    }

    public void save(User std) {
        repo.save(std);
    }

    public User get(long id) {
        return repo.findById(id).get();
    }


}
