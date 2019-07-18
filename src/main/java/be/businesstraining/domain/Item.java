package be.businesstraining.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "items")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @Id
    private String id;
    private String itemName;
    private BigDecimal price;
    private String picture;
    private String descrpition;
    private String type;
    private int stock;


}
