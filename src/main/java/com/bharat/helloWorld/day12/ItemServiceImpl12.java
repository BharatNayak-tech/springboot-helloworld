package com.bharat.helloWorld.day12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl12 implements ItemService12 {

    @Autowired
    private ItemRepository12 itemRepository12;

    @Override
    public List<ItemDTO12> getProductByName(String name) {
        List<Item12> items = itemRepository12.findByName(name);

        return items.stream().map(i -> new ItemDTO12(i.getName(), i.getQuantity())).collect(Collectors.toList());
    }


    @Override
    public List<ItemDTO12> getProductById(int id) {
        List<Item12> itemIds = itemRepository12.findByQuantityGreaterThan(id);

        return itemIds.stream().map(i -> new ItemDTO12(i.getName(),i.getQuantity())).collect(Collectors.toList());

    }

    public List<ItemDTO12> getByNameContaining (String keyword){
           List<Item12> itemsContain=itemRepository12.findByNameContaining(keyword);

      return itemsContain.stream().map(match->new ItemDTO12(match.getName(),match.getQuantity())).collect(Collectors.toList());

    }

    public List<ItemDTO12> addItems(List<ItemDTO12> itemDTO12){
    List<Item12> itemsss=itemDTO12.stream().map(itemss-> new Item12(0,itemss.getName(),itemss.getQuantity())).collect(Collectors.toList());
List<Item12> saveItems=itemRepository12.saveAll(itemsss);
return  saveItems.stream().map(values ->new ItemDTO12(values.getName(),values.getQuantity())).collect(Collectors.toList());

    }
}