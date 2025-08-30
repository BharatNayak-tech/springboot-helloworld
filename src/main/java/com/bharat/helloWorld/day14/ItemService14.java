package com.bharat.helloWorld.day14;

import org.springframework.data.domain.Page;

public interface ItemService14 {

    Page<ItemDto14> getAllItemsPaged(int page, int size, String sortBy);
}
