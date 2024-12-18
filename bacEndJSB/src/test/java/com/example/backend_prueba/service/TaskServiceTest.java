package com.example.backend_prueba.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.backend_prueba.service.TaskService;

@SpringBootTest
public class TaskServiceTest {

    @Autowired
    private TaskService taskService;

    @Test
    void testCreateTask() {
        // Escribe tu prueba aquí
    }

    // Otros métodos de prueba para los servicios relacionados con las tareas
}
