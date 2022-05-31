package com.example.Aegis.repository;

import com.example.Aegis.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_Repo extends CrudRepository<User,Long> {


}
