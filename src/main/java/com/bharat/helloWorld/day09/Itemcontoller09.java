package com.bharat.helloWorld.day09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.RecursiveTask;

@RestController
@RequestMapping("api/items/data")
public class Itemcontoller09 {

    @Autowired
    private ItemService09 itemService09;
     @PostMapping()
    public ItemDto09 addItem(@RequestBody ItemDto09 itemDto){
        return itemService09.saveItem(itemDto);
    }

    @GetMapping
public List<ItemDto09> getItems(){
        return itemService09.getAllItems();
    }

}
