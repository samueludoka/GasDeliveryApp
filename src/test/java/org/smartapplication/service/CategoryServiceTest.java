package org.smartapplication.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.smartapplication.controller.CategoryController;
import org.smartapplication.dto.request.CategoryRequest;
import org.smartapplication.dto.response.CategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@AutoConfigureMockMvc
@SpringBootTest
class CategoryServiceTest {
    @Autowired
    private CategoryService categoryService;


//    @Autowired
//    private CategoryController categoryController;

    @Test
    public void addCategoryToProduct() throws Exception{
        CategoryRequest categoryRequest = new CategoryRequest();
        categoryRequest.setName("Food category");
        categoryRequest.setDescription("soft drinks");
        categoryRequest.setCreatedAt(LocalDate.of(2024, 03,23));
        categoryRequest.setUpdatedAt(LocalDate.of(2024,04, 22));
        categoryRequest.setProductUuid("234yr23");
        CategoryResponse categoryResponse = categoryService.addCategoryToProduct(categoryRequest);
        assertNotNull(categoryResponse);
        assertNotNull(categoryResponse.getId());

    }

}