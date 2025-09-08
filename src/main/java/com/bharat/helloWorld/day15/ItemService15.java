package com.bharat.helloWorld.day15;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemService15 {
    Page<ItemDTO15> getItemsFilteredPaged(int qty,int page,int size,String sortBy);
}
