package com.example.backend_prueba.model.public_;

import jakarta.persistence.*;

@Entity
@Table(name = "user_groups", schema = "public")
public class UserGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, columnDefinition = "TEXT")
    private String name;

    // Cambié el tipo de String a Integer para privilegios
    @Column(name = "privileges", nullable = false)
    private int privileges; // Privilegios como un número entero

    // Constructor sin parámetros, necesario para Hibernate
    public UserGroup() {
        this.privileges = 1; // Valor por defecto para los privilegios
    }

    // Constructor con parámetros
    public UserGroup(String name, int privileges) {
        this.name = name;
        this.privileges = privileges;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrivileges() {
        return privileges;
    }

    public void setPrivileges(int privileges) {
        this.privileges = privileges;
    }
}
