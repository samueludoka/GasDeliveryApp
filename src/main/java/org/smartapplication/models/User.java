package org.smartapplication.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

import static jakarta.persistence.FetchType.EAGER;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uuid;
    private String userName;
    private String email;
    private String password;
    private String telephone;
    private String address;
    private LocalDate createdAt;
    private LocalDate updateAt;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    @ManyToMany(fetch = EAGER)
    private List<Product> productList;

    @OneToMany(fetch = EAGER, cascade = {CascadeType.MERGE})
    private List<Payment> payment;

    @OneToMany(fetch = EAGER, cascade = {CascadeType.MERGE})
    private List<Order> orderList;
}


