package org.smartapplication.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.smartapplication.dto.request.CategoryRequest;
import org.smartapplication.dto.response.CategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
@AutoConfigureMockMvc
@SpringBootTest
class CategoryServiceTest {


}