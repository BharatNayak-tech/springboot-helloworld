package com.bharat.helloWorld.day13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl13 implements ItemService13 {
    @Autowired

    private ItemRepository13 itemRepository13;

    @Override
    public  List<ItemDto13> getItemsGreaterThanQty(int qty){
       // List<Item13> items= itemRepository13.getItemsGreaterThanQty(qty);
        return  itemRepository13.getItemsGreaterThanQty(qty).stream().map(i->new ItemDto13(i.getName(),i.getQuantity())).collect(Collectors.toList());

    }


    public  List<ItemDto13> getItemGreaterThanQtyNative(int qty){
        // List<Item13> items= itemRepository13.getItemsGreaterThanQty(qty);
        return  itemRepository13.getItemsGreaterThanQty(qty).stream().map(i->new ItemDto13(i.getName(),i.getQuantity())).collect(Collectors.toList());

    }




}
