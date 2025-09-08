package com.bharat.helloWorld.day15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
    @RequestMapping("/items")
public class ItemController15 {
@Autowired
    private  ItemService15 itemService15;

    @GetMapping("/filter")
    public Page<ItemDTO15> getFilteredItems(
            @RequestParam int qty,
            @RequestParam (defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size,
            @RequestParam(defaultValue = "id") String sortBy){

        return itemService15.getItemsFilteredPaged(qty,page,size,sortBy);
    }


}
