package org.smartapplication.service;

import org.junit.jupiter.api.Test;
import org.smartapplication.dto.request.ProductRequest;
import org.smartapplication.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProductServiceImplTest {
    @Autowired
    ProductService productService;

    @Autowired
    ProductRepository productRepository;

    @Test
    public void testGetAllProduct(){
        List<ProductRequest> productRequestList = new ArrayList<>();
        ProductRequest productRequest = new ProductRequest();
        productRequest.setName("Pure heaven perfume");
        productRequest.setDescription("perfume");
        productRequest.setPrice();
    }

}