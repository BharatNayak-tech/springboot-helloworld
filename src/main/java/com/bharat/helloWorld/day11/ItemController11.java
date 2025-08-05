package com.bharat.helloWorld.day11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/items")
public class ItemController11 {
    @Autowired
    private   ItemService11 itemService11;
    @PostMapping("/bulk")
    public List<ItemDTO11> saveAllItems(@RequestBody List<ItemDTO11> itemss){
        return  itemService11.saveItems(itemss);
    }
}
