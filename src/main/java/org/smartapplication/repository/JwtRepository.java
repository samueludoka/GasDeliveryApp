package org.smartapplication.repository;


import org.smartapplication.models.Jwt;
import org.smartapplication.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JwtRepository extends JpaRepository<Jwt, Long> {
    Jwt findByUser(User user);
}
