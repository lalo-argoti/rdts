package com.example.backend_prueba.config;

import com.example.backend_prueba.model.public_.UserGroup;
import com.example.backend_prueba.repository.UserGroupRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    public CommandLineRunner init(UserGroupRepository userGroupRepository) {
        return args -> {
            // Crear los grupos de usuario si no existen
            if (userGroupRepository.findByName("admin") == null) {
                // Usamos 3 como valor para "lectura" (1) y "escritura" (2)
                userGroupRepository.save(new UserGroup("admin", 3)); // 3 -> Lectura + Escritura
            }
            if (userGroupRepository.findByName("user") == null) {
                // Usamos 1 como valor para "lectura"
                userGroupRepository.save(new UserGroup("user", 1)); // 1 -> Solo Lectura
            }
        };
    }
}