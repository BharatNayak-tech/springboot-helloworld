package com.bharat.helloWorld.day6;

import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService{
@Override
    public ItemDTO getItem(){
        Item item=new Item("laptop",25100,"ABC678Z");
        return new ItemDTO(item.getName(),item.getPrice());
    }

}
