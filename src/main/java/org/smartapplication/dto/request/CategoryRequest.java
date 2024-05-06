package org.smartapplication.dto.request;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class CategoryRequest {
    private Long id;
    private String uuid;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private String productUuid;


    public Long getProductId() {
        return id;
    }
}
