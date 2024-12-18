package com.example.backend_prueba.repository;

import com.example.backend_prueba.model.public_.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserGroupRepository extends JpaRepository<UserGroup, Long> {
    UserGroup findByName(String name);
}
