package org.smartapplication.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.EAGER;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String orderNumber;
    private LocalDate orderDate;
    private Double totalAmount;
    private OrderStatus status;
    @ManyToOne(fetch = EAGER, cascade = {CascadeType.MERGE})
    private User user;

    @OneToMany(fetch = EAGER, cascade = {CascadeType.MERGE})
    private List<OrderItem> orderItem = new ArrayList<>();
}
