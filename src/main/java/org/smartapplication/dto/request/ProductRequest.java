package org.smartapplication.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProductRequest {
    private String name;
    private String uuid;
    private String description;
    private BigDecimal price;
    private int stockQuantity;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private String categoryName;
    private String categoryUuid;
}
