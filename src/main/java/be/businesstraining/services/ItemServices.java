package be.businesstraining.services;

import be.businesstraining.domain.Item;


import java.util.Set;

public interface ItemServices {
    Set<Item> allItem();
    Item getItemById(String id);
}
