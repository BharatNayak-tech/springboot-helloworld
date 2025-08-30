package com.bharat.helloWorld.day14;

import com.bharat.helloWorld.day6.ItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImp14 implements ItemService14{


    @Autowired
    ItemRepository14 itemRepository14;
    @Override
    public Page<ItemDto14> getAllItemsPaged(int page, int size, String sortBy) {

        Pageable pageable= PageRequest.of(page,size, Sort.by(sortBy));

        Page<Item14> pagedItemRes=itemRepository14.findAll(pageable);
        return pagedItemRes.map(i -> new ItemDto14(i.getName(),i.getQuantity()));
    }
}
