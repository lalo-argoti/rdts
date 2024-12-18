package com.example.backend_prueba.model;

import com.example.backend_prueba.model.public_.User;
import com.example.backend_prueba.model.public_.UserGroup;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testUserConstructorAndGetters() {
        // Crear un grupo de usuario de prueba
        UserGroup group = new UserGroup();
        group.setId(1L);
        group.setName("Admin");

        // Crear un usuario con el constructor
        User user = new User("testuser", "testuser@example.com", "password123", group);

        // Validar que los valores sean los esperados
        assertEquals("testuser", user.getUsername());
        assertEquals("testuser@example.com", user.getEmail());
        assertEquals("password123", user.getPassword());
        assertEquals(group, user.getGroup());
        assertNotNull(user.getCreatedAt()); // Validar que la fecha de creación se haya establecido
    }

    @Test
    void testUserSetters() {
        // Crear un usuario vacío
        User user = new User();

        // Validar setters
        user.setUsername("updatedUser");
        user.setEmail("updatedUser@example.com");
        user.setPassword("newPassword");

        // Validar que los setters funcionen correctamente
        assertEquals("updatedUser", user.getUsername());
        assertEquals("updatedUser@example.com", user.getEmail());
        assertEquals("newPassword", user.getPassword());
    }

    @Test
    void testDefaultCreatedAt() {
        // Crear un usuario
        User user = new User();

        // Validar que la fecha de creación por defecto sea actual
        assertNotNull(user.getCreatedAt());
        assertTrue(ZonedDateTime.now().isAfter(user.getCreatedAt()) || ZonedDateTime.now().isEqual(user.getCreatedAt()));
    }

    @Test
    void testGroupRelation() {
        // Crear un grupo de usuario de prueba
        UserGroup group = new UserGroup();
        group.setId(1L);
        group.setName("Test Group");

        // Crear un usuario y establecer el grupo
        User user = new User();
        user.setGroup(group);

        // Validar la relación con el grupo
        assertEquals(group, user.getGroup());
    }
}