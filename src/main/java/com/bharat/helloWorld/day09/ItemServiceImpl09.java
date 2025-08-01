package com.bharat.helloWorld.day09;

import com.bharat.helloWorld.day8.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl09 implements ItemService09 {

    @Autowired
    private  ItemRepository itemRepository;

@Override
    public ItemDto09 saveItem(ItemDto09 dto){
    Items item=new Items();
    item.setName(dto.getName());
    item.setQuantity(dto.getQuantity());
    itemRepository.save(item);

return  dto;
    }
@Override
    public List<ItemDto09> getAllItems(){
    List<Items> items = itemRepository.findAll();
    return items.stream()
            .map(i -> new ItemDto09(i.getName(), i.getQuantity()))
            .collect(Collectors.toList());
    }

}
