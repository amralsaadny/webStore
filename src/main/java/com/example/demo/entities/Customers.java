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
public class Customers {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private String customerID;
    private String userName;
    private String email;
    private String password;

}
