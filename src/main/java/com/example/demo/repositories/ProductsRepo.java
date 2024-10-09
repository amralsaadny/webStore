package com.example.demo.repositories;

import com.example.demo.entities.Products;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductsRepo extends CrudRepository<Products,Integer> {
      List<Products> findAll();
}
