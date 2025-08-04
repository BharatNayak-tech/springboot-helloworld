package com.bharat.helloWorld.day10;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository10 extends JpaRepository<Item,Integer> {
}
