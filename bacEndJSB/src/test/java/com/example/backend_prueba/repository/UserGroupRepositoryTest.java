package com.example.backend_prueba.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.backend_prueba.repository.UserGroupRepository;
import com.example.backend_prueba.model.public_.UserGroup;

@SpringBootTest
public class UserGroupRepositoryTest {

    @Autowired
    private UserGroupRepository userGroupRepository;

    @Test
    void testSaveUserGroup() {
        // Escribe tu prueba aquí
    }

    // Otros métodos de prueba para las operaciones CRUD del repositorio de grupos de usuarios
}
