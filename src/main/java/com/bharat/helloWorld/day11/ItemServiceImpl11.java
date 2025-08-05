package com.bharat.helloWorld.day11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl11 implements ItemService11{

    @Autowired
    private   ItemRepository11 itemRepository11;

    public List<ItemDTO11> saveItems(List<ItemDTO11> items){
        List<Item11> saveitem=items.stream().map(dto->new Item11(0, dto.getName(), dto.getQuantity()))
                .collect(Collectors.toList());

        List<Item11> save=itemRepository11.saveAll(saveitem);

        return save.stream().map(item ->new ItemDTO11(item.getName(),item.getQuantity()))
                .collect(Collectors.toList());



    }


}
