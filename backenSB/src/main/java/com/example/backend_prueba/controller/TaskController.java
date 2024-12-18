package com.example.backend_prueba.controller;

import com.example.backend_prueba.model.public_.Task;
import com.example.backend_prueba.model.public_.User;
import com.example.backend_prueba.repository.TaskRepository;
import com.example.backend_prueba.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserRepository userRepository;

    // Endpoint para obtener tareas (filtrado por UserGroup)
    @GetMapping
    public ResponseEntity<List<Task>> getTasks(@RequestParam("username") String username) {
        // Buscar el usuario por su nombre de usuario
        Optional<User> userOpt = userRepository.findByUsername(username);

        if (userOpt.isPresent()) {
            User user = userOpt.get(); // Obtener el objeto User

            // Verificar si el grupo no es nulo antes de acceder
            if (user.getGroup() != null) {
                // Si el grupo es "admin", retornar todas las tareas
                if ("admin".equals(user.getGroup().getName())) {
                    return new ResponseEntity<>(taskRepository.findAll(), HttpStatus.OK);
                }
                // Si el grupo es "user", retornar solo las tareas asociadas al usuario
                return new ResponseEntity<>(taskRepository.findByUser(user), HttpStatus.OK);
            } else {
                // Si el grupo es nulo, retornar un error
                return new ResponseEntity<>(HttpStatus.FORBIDDEN); // o cualquier otro código de error adecuado
            }
        }

        // Si el usuario no existe, retornar un código 404
        return new ResponseEntity<>(List.of(), HttpStatus.NOT_FOUND);
    }

    // Endpoint para crear una tarea
    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        // Guardamos la tarea en la base de datos
        Task savedTask = taskRepository.save(task);
        return new ResponseEntity<>(savedTask, HttpStatus.CREATED); // Retornar 201 Created
    }
}
