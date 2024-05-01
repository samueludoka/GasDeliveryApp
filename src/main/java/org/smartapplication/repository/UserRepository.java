package org.smartapplication.repository;

import org.smartapplication.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    void deleteByUuid(String uuid);
    Optional<User> findByUuid(String uuid);
    User findByUserName(String userName);

    User findByEmail(String email);
}
