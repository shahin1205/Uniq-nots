package com.example.shoppingcart.controller;

import com.example.shoppingcart.model.Items;
import com.example.shoppingcart.service.ItemInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controller")
public class ItemController {

    @Autowired
    ItemInterface itemInterface;

    @PostMapping("/save")
    public Items saveItem(@RequestBody Items items){
        return itemInterface.addItems(items);
    }
    @GetMapping("/getById")
    public Items getById(@RequestParam("id") int id){
        return itemInterface.getItemsById(id);
    }
    @GetMapping("/getAll")
    public List<Items> getAllItems(){
        return itemInterface.getAllItems();
    }

    @PutMapping("/update")
    public Items updates(@RequestParam ("id") int id,@RequestBody Items items){
        return itemInterface.updateItem(id,items);
    }
    @DeleteMapping("/delete")
    public String deletes(@RequestParam ("id") int id){
        return  itemInterface.deleteItem(id);
    }
}
