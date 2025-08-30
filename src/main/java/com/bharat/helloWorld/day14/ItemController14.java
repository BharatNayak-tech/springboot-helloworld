package com.bharat.helloWorld.day14;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ItemController14 {
    @Autowired
    private  ItemService14 itemService14;
@GetMapping("/page")
    public Page<ItemDto14>getItemsPaged(
@RequestParam(defaultValue = "0")int page,
@RequestParam(defaultValue = "5") int size,
@RequestParam(defaultValue = "id")String sortBy){
    return  itemService14.getAllItemsPaged(page, size, sortBy);
}

}
