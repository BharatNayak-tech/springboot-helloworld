package com.bharat.helloWorld.day15;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository15 extends JpaRepository<Item15,Integer>{

        Page<Item15> findByQuantityGreaterThan(int qty , Pageable pageable);

}
