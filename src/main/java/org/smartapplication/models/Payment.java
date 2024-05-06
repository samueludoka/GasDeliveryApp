package org.smartapplication.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

import static jakarta.persistence.FetchType.EAGER;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uuid;
    private String name;
    private String cardNumber;
    private String expirationDate;
    private String cvc;
    private BigDecimal amount;
    @ManyToMany
    private List<Product> products;

//    @ManyToOne(fetch = EAGER, cascade = {CascadeType.MERGE})
//    private User user;
}
