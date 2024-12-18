package com.example.backend_prueba.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.backend_prueba.repository.TaskRepository;
import com.example.backend_prueba.model.public_.Task;

@SpringBootTest
public class TaskRepositoryTest {

    @Autowired
    private TaskRepository taskRepository;

    @Test
    void testSaveTask() {
        // Escribe tu prueba aquí
    }

    // Otros métodos de prueba para las operaciones CRUD del repositorio de tareas
}
