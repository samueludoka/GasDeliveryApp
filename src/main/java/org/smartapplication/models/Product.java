package org.smartapplication.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String uuid;
    private String description;
    private String price;
    private String stockQuantity;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    @ManyToOne
    private Category category;
    @ManyToMany
    private List<User> userLists;
    @ManyToMany
    private List<Payment>payments;

}

