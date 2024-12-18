package com.example.backend_prueba.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import com.example.backend_prueba.controller.TaskController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
public class TaskControllerTest {

    @Autowired
    private TaskController taskController;

    private MockMvc mockMvc;

    public TaskControllerTest() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(taskController).build();
    }

    @Test
    void testGetAllTasks() throws Exception {
        // Escribe tu prueba aquí
    }

    // Otros métodos de prueba para los endpoints del controlador
}

