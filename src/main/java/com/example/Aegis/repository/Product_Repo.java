package com.example.Aegis.repository;

import com.example.Aegis.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Product_Repo extends CrudRepository<Product,Long> {
}
