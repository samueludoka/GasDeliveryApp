package org.smartapplication.service.implementation;

import com.fasterxml.jackson.databind.util.BeanUtil;
import lombok.AllArgsConstructor;
import org.smartapplication.dto.request.CategoryRequest;
import org.smartapplication.dto.response.CategoryResponse;
import org.smartapplication.models.Category;
import org.smartapplication.models.Product;
import org.smartapplication.repository.CategoryRepository;
import org.smartapplication.repository.ProductRepository;
import org.smartapplication.service.CategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;


    @Override
    public CategoryResponse addCategoryToProduct(CategoryRequest categoryRequest) {
        Product product = productRepository.findByUuid(categoryRequest.getProductUuid())
                .orElseThrow(() -> new RuntimeException("Product not found with UUID"));

        Category category = convertToEntity(categoryRequest);
        category.getProductList().add(product);

        Category savedCategory = categoryRepository.save(category);
        return convertToRequest(savedCategory);
    }

    private CategoryResponse convertToRequest(Category category) {
        CategoryRequest categoryRequest = new CategoryRequest();
        BeanUtils.copyProperties(category, categoryRequest);
        CategoryResponse categoryResponse = new CategoryResponse();
        return categoryResponse;
    }

    private Category convertToEntity(CategoryRequest categoryRequest) {
        Category category = new Category();
        BeanUtils.copyProperties(categoryRequest, category);
        return category;
    }
}
