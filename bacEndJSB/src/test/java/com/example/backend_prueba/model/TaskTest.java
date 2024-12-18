package com.example.backend_prueba.model;

import com.example.backend_prueba.model.public_.Task;
import com.example.backend_prueba.model.public_.User;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    void testTaskConstructor() {
        // Crear un objeto User para pasar al constructor (simulamos un User con ID 1)
        User user = new User();
        user.setId(1L);  // Asignamos un ID al usuario (puedes adaptarlo según cómo estés manejando la clase User)

        // Crear una fecha para dueDate (puedes usar cualquier fecha o null si deseas probar sin fecha)
        Date dueDate = new Date();  // Usamos la fecha actual para la prueba

        // Crear la tarea
        Task task = new Task(user, "Test Task", "Test Description", "PENDING", dueDate, "HIGH");

        // Realizar las aserciones
        assertNotNull(task);
        assertEquals("Test Task", task.getTitle());
        assertEquals("Test Description", task.getDescription());
        assertEquals("PENDING", task.getStatus());
        assertNotNull(task.getDueDate());  // Verifica que dueDate no sea null (porque hemos pasado una fecha válida)
        assertEquals(dueDate, task.getDueDate());  // Verifica que dueDate sea la misma que la pasada en el constructor
        assertEquals("HIGH", task.getPriority());
        assertNotNull(task.getCreatedAt());  // Verifica que createdAt no sea null
        assertNotNull(task.getUpdatedAt());  // Verifica que updatedAt no sea null
    }
}
