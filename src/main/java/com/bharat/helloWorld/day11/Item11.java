package com.bharat.helloWorld.day11;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Item11 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    int quantity;


}
