package com.example.backend_prueba.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class TaskControllerTest {

    @Autowired
    private TaskController taskController;  // se asegura de que tu controlador esté correctamente inyectado

    @Test
    void testGetAllTasks() {
        assertNotNull(taskController);  // Verifica que el controlador no sea nulo
        // Ha accedido al controlador
    }
}