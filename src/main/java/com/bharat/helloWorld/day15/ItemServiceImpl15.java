package com.bharat.helloWorld.day15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl15 implements ItemService15{
    @Autowired
private  ItemRepository15 itemRepository15;
    @Override
    public Page<ItemDTO15> getItemsFilteredPaged(int qty, int page, int size, String sortBy) {

        Pageable pageable= PageRequest.of(page,size, Sort.by(sortBy));
        Page<Item15> itemDetails=itemRepository15.findByQuantityGreaterThan(qty,pageable);
      return itemDetails.map(i->new ItemDTO15(i.getQuantity(), i.getName()));

    }
}
