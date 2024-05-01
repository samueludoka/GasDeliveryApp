package org.smartapplication.repository;

import org.smartapplication.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository {
    List<Order> findByUserId(Long userId);
    List<Order> findBbyOrderNumber(String orderNumber);

    List<Order> findByUserUuid(String userId);
}
