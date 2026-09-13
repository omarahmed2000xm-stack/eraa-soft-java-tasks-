package com.spring.springboot.item.Service;

import com.spring.springboot.item.Repositery.ItemRepository;
import com.spring.springboot.item.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImpl implements ItemService{
    private final ItemRepository itemRepository;
    public ItemServiceImpl(ItemRepository itemRepository){
        this.itemRepository=itemRepository;
    }

    @Override
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item addItemById(long id) {
        return itemRepository.findById(id).orElse(null);
    }



    @Override
    public Item removeItem(Item item) {
        itemRepository.delete(item)
         ; return item;
    }

    @Override
    public boolean removeItemById(long id) {
        if (itemRepository.existsById(id)){
            itemRepository.deleteById(id);
            return  true;
        }
        return false;
    }

    @Override
    public List<Item> showItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItemById(long id) {
return itemRepository.findById(id).orElse(null);


        }

    }

