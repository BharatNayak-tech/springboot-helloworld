package com.bharat.helloWorld.day13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController13 {

    @Autowired
    private ItemService13 itemService13;

    @GetMapping("/quantity/{qty}")
    public List<ItemDto13> getAllItems(@PathVariable int qty){
        return  itemService13.getItemsGreaterThanQty(qty);
    }
}
