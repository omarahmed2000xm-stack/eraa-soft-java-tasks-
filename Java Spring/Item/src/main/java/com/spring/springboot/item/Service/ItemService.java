package com.spring.springboot.item.Service;

import com.spring.springboot.item.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ItemService {
    Item addItem(Item item);
    Item addItemById(long id );
    List<Item> showItems();
    Item removeItem(Item item);
    boolean removeItemById(long id );
    Item getItemById(long id );

}
