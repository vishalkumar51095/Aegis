package com.example.Aegis.repository;

import com.example.Aegis.domain.User_Purchase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_Purchase_Repo extends CrudRepository<User_Purchase,Long> {
}
