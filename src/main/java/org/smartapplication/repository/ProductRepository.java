package org.smartapplication.repository;

import org.smartapplication.dto.request.CategoryRequest;
import org.smartapplication.models.Category;
import org.smartapplication.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findProductByUuid(String productUuid);
}

