package com.example.backend_prueba.repository;

import com.example.backend_prueba.model.public_.Task;
import com.example.backend_prueba.model.public_.User; // Asegúrate de importar la clase User
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    // Correcto: Acceder al ID del usuario relacionado
    List<Task> findByUser_Id(Long userId);  // Usa "User_Id" en lugar de "UserId"

    // Ejemplo de consulta para obtener las tareas con un estado específico
    List<Task> findByStatus(String status);

    // Consultar tareas por el objeto User
    List<Task> findByUser(User user);  // Esto es correcto
}