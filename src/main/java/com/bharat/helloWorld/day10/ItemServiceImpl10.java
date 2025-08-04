package com.bharat.helloWorld.day10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl10 implements ItemService10 {
@Autowired
private ItemRepository10 itemRepository;
@Override
     public ItemDTO10 saveItem(ItemDTO10 dto){
         Item item=new Item();
         item.setName(dto.getName());
         item.setPrice(dto.getPrice());
         itemRepository.save(item);
         return  dto;

     }
     @Override
     public List<ItemDTO10> getAllItems(){
    List<Item>items =itemRepository.findAll() ;
   return items.stream().map(item -> new ItemDTO10(item.getName(),item.getPrice())).collect(Collectors.toList());

}
@Override
public ItemDTO10 getItem(int id){
    Item p = itemRepository.findById(id).orElse(null);
    if(p==null){
        return  null;
    }
return new ItemDTO10(p.getName(),p.getPrice());
}
@Override
public String getDeleteItem(int id){
itemRepository.deleteById(id);
return "product has been deleted";
}

}
