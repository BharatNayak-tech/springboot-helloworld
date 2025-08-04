package com.bharat.helloWorld.day10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product/item")
public class ItemController10 {



    @Autowired
    private ItemService10 itemService;
    @PostMapping
    public ItemDTO10 saveItem(@RequestBody ItemDTO10 itemDTO){
        return  itemService.saveItem(itemDTO);
    }

    @GetMapping
    public List<ItemDTO10> getAllItem(){
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")
    public ItemDTO10 getItem(@PathVariable int id){
        return itemService.getItem(id);
    }

    @DeleteMapping("/{id}")
    public String getDeleteItem(@PathVariable  int id){
        return itemService.getDeleteItem(id);
    }
}
