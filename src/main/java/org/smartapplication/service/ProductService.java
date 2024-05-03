package org.smartapplication.service;

import org.smartapplication.dto.request.ProductRequest;

import java.util.List;

public interface ProductService {
    List<ProductRequest> getAllProducts();

}
