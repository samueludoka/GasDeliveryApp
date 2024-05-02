package org.smartapplication.dto.request;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class CategoryRequest {
    private String uuid;
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private String productUuid;

}
