package org.rma.productmvcdemo.model;



import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private String description;
}
