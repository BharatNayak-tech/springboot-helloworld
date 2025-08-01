package com.bharat.helloWorld.day09;

import org.springframework.stereotype.Service;

import java.util.List;


public interface ItemService09 {


    ItemDto09 saveItem(ItemDto09 itemDto09);

    List<ItemDto09> getAllItems();


}
