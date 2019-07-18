package be.businesstraining.services;

import be.businesstraining.domain.Item;
import be.businesstraining.repository.ItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Service
public class ItemServicesImpl implements ItemServices {

    private ItemRepository itemRepository;

    @Override
    public Set<Item> allItem() {
        return new HashSet<>(itemRepository.findAll());

    }

    @Override
    public Item getItemById(String id) {
        return itemRepository.findById(id).orElse(null);
    }
}
