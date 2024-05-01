package org.smartapplication.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    @ManyToOne
    private User user;

    @OneToMany
    private List<OrderItem> orderItem = new ArrayList<>();
}
