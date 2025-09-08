package com.bharat.helloWorld.day15;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Item15 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    int quantity;

    String name;



}
