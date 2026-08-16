package com.example.shoppingcart.service;

import com.example.shoppingcart.model.Items;
import com.example.shoppingcart.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemInterface {
    @Autowired
    ItemRepository repository;
    @Override
    public Items addItems(Items items) {
        return repository.save(items);
    }

    @Override
    public Items getItemsById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Items> getAllItems() {
        return repository.findAll();
    }

    @Override
    public Items updateItem(int id, Items item) {
        Items items=repository.findById(id).get();
        items.setQuantity(item.getQuantity());
        items.setTotal(items.getPrice()*item.getQuantity());
        return repository.save(items);
    }

    @Override
    public String deleteItem(int id) {
        Items items=null;
        try {
            items=repository.findById(id).orElseThrow(
                    ()->{throw new RuntimeException("id not found");}
            );
            repository.delete(items);
            return "Success fully deleted";
        }catch (RuntimeException e){
            e.getMessage();
        }
        return "id not found";
    }
}
