package com.bharat.helloWorld.day13;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository13 extends JpaRepository<Item13,Integer> {

    //jpqa example
    @Query("SELECT i FROM Item13 i WHERE i.quantity> :qty")
    List<Item13> getItemsGreaterThanQty(@Param("qty") int qty);

    //native sql example

    @Query(value="SELECT * FROM item13 WHERE quantity>:qty",nativeQuery = true)
    List<Item13>getItemGreaterThanQtyNative(@Param("qty") int qty);


}
