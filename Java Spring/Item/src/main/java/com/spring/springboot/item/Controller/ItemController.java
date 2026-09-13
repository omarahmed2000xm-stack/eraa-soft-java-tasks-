package com.spring.springboot.item.Controller;

import com.spring.springboot.item.Service.ItemService;
import com.spring.springboot.item.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/item")
@ResponseBody
public class ItemController {
private final ItemService itemService;
public  ItemController(ItemService itemService) {
    this.itemService = itemService;
}
@PostMapping
public  Item addItem(@RequestBody Item item){
    return itemService.addItem(item);
}

@GetMapping("/{id}")
    public  Item getItemById( @PathVariable long id ) {
   return itemService.getItemById(id);
}
@GetMapping
    public List<Item> showItems( ){
    return itemService.showItems();
};
@DeleteMapping
 public Item removeItem( @RequestBody Item item){
   return itemService.removeItem(item);
};
@DeleteMapping("/{id}")
public   boolean removeItemById(@PathVariable  long id ){
    return itemService.removeItemById(id);
};
}
