package com.bharat.helloWorld.day12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products/item")
public class ItemController12 {
@Autowired
private ItemService12 itemService12;
    @GetMapping("/name/{name}")

    public List<ItemDTO12> getByProductName(@PathVariable String name){
        return itemService12.getProductByName(name);
    }

    @GetMapping("/quantity/{quantity}")
    public List<ItemDTO12> getProductById(@PathVariable int quantity){
        return itemService12.getProductById(quantity);
    }


    @GetMapping("/contains/{keyword}")

    public List<ItemDTO12> getNameByStringContain( @PathVariable  String keyword){
        return itemService12.getByNameContaining(keyword);
    }


    @PostMapping()
    public List<ItemDTO12> addItems(@RequestBody List<ItemDTO12> itemDTO12){
        return  itemService12.addItems(itemDTO12);
    }
 
}
