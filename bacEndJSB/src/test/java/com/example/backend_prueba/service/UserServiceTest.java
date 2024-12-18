package com.example.backend_prueba.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.backend_prueba.service.UserService;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void testRegisterUser() {
        // Escribe tu prueba aquí
    }

    // Otros métodos de prueba para los servicios relacionados con usuarios
}
