package com.bharat.helloWorld.day11;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository11 extends JpaRepository<Item11,Integer> {
}
