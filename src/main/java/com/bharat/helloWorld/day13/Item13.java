package com.bharat.helloWorld.day13;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Item13 {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String name;

    private int quantity;

}
