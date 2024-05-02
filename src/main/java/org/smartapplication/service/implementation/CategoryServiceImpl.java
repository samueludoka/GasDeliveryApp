package org.smartapplication.service.implementation;

import lombok.AllArgsConstructor;
import org.smartapplication.dto.request.CategoryRequest;
import org.smartapplication.dto.response.CategoryResponse;
import org.smartapplication.models.Product;
import org.smartapplication.repository.CategoryRepository;
import org.smartapplication.repository.ProductRepository;
import org.smartapplication.service.CategoryService;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;


    @Override
    public CategoryResponse addCategoryToProduct(CategoryRequest categoryRequest) {
        Product product = productRepository.findBy();
        return null;
    }
}
