package com.example.shoppingcart.service;

import com.example.shoppingcart.model.Items;

import java.util.List;

public interface ItemInterface {
    Items addItems(Items items);
    Items getItemsById(int id);
    List<Items> getAllItems();
    Items updateItem(int id,Items items);
    String deleteItem(int id);
}
