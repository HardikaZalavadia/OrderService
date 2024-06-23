package dev.hardika.orderService.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product extends BaseModel{
    private String productName;
    private String productDescription;
    private double productPrice;
    private int productQuantity;
}
