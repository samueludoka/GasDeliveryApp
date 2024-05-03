package org.smartapplication.service.implementation;

import org.smartapplication.dto.request.ProductRequest;
import org.smartapplication.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<ProductRequest> getAllProducts() {
        return null;
    }
}
