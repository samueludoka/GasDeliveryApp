package org.smartapplication.repository;

import org.smartapplication.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository {
    Payment findByUuid(String uuid);
    Payment findByUserUuid(String userUuid);
    List<Payment> findByProducts_Uuid(String productUuid);



}
