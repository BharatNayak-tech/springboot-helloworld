package com.bharat.helloWorld.day6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
@Autowired
    public  ItemService itemService;

@GetMapping("/api/items")
    public  ItemDTO getItemDTO(){

    return itemService.getItem();
    }
}
