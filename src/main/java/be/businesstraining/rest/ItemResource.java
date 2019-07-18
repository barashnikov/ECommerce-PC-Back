package be.businesstraining.rest;

import be.businesstraining.domain.Item;
import be.businesstraining.services.ItemServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/items")
@AllArgsConstructor
public class ItemResource {

    private ItemServices itemServices;

    @GetMapping
    public Set<Item> allItems(){
        return itemServices.allItem();
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable String id){
        return itemServices.getItemById(id);
    }
}
