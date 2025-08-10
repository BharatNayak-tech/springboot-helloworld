package com.bharat.helloWorld.day12;

import java.util.List;

public interface ItemService12 {



    List<ItemDTO12> getProductByName(String name);

    List<ItemDTO12> getProductById(int id);

    List<ItemDTO12> getByNameContaining(String keyword);

    List<ItemDTO12> addItems(List<ItemDTO12> itemDTO12);
}
