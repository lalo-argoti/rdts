package com.example.backend_prueba.repository;

import com.example.backend_prueba.model.public_.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Método para buscar un usuario por su nombre de usuario
    Optional<User> findByUsername(String username);

    // Método para buscar un usuario por su correo electrónico
    Optional<User> findByEmail(String email);
    boolean existsByUsername(String username);
}
