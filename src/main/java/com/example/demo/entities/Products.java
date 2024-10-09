package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Products {
     @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    int id;
     float price;
     String name;
     String categories;
     String threeDModel;
     String numberInStorage;
}
