package com.example.Aegis.repository;

import com.example.Aegis.domain.User_Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_Role_Repo extends CrudRepository<User_Role,Long> {

}
