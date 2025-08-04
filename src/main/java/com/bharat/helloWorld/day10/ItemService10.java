package com.bharat.helloWorld.day10;


import java.util.List;

public interface ItemService10 {


     ItemDTO10 saveItem(ItemDTO10 itemDTO);

     List<ItemDTO10> getAllItems();

     ItemDTO10 getItem(int id);

     String getDeleteItem(int id);
}
