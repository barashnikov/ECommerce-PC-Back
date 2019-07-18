package be.businesstraining.repository;

import be.businesstraining.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<Item, String> {

}
