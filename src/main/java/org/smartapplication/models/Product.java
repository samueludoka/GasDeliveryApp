package org.smartapplication.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

import static jakarta.persistence.FetchType.EAGER;

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
    @ManyToOne(fetch = EAGER, cascade = {CascadeType.MERGE})
    private Category category;
    @ManyToMany(fetch = EAGER, cascade = {CascadeType.MERGE})
    private List<User> userLists;
    @ManyToMany(fetch = EAGER, cascade = {CascadeType.MERGE})
    private List<Payment>payments;

}

