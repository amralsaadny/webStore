package com.example.demo.repositories;

import com.example.demo.entities.Customers;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CustomerRepo extends CrudRepository<Customers, Integer> {
    @Override
    List<Customers> findAll();
}
