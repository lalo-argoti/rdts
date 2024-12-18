package com.example.backend_prueba.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.backend_prueba.repository.UserRepository;
import com.example.backend_prueba.model.public_.User;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testSaveUser() {
        // Escribe tu prueba aquí
    }

    // Otros métodos de prueba para las operaciones CRUD del repositorio de usuarios
}
