package com.bharat.helloWorld.day12;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository12 extends JpaRepository<Item12,Integer> {

    List<Item12> findByName(String name);

    List<Item12> findByQuantityGreaterThan(int quantity);

    List<Item12> findByNameContaining(String keyword);
}
