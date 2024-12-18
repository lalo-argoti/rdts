package com.example.backend_prueba.controller;

import com.example.backend_prueba.model.public_.UserGroup;
import com.example.backend_prueba.repository.UserGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user-groups")
public class UserGroupController {

    @Autowired
    private UserGroupRepository userGroupRepository;

    // Obtener todos los grupos
    @GetMapping
    public List<UserGroup> getAllGroups() {
        return userGroupRepository.findAll();
    }

    // Obtener un grupo por ID
    @GetMapping("/{id}")
    public ResponseEntity<UserGroup> getGroupById(@PathVariable Long id) {
        Optional<UserGroup> groupOpt = userGroupRepository.findById(id);
        if (groupOpt.isPresent()) {
            return ResponseEntity.ok(groupOpt.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Crear un nuevo grupo
    @PostMapping
    public ResponseEntity<UserGroup> createGroup(@RequestBody UserGroup group) {
        UserGroup newGroup = userGroupRepository.save(group);
        return ResponseEntity.ok(newGroup);
    }

    // Actualizar un grupo
    @PutMapping("/{id}")
    public ResponseEntity<UserGroup> updateGroup(@PathVariable Long id, @RequestBody UserGroup groupDetails) {
        Optional<UserGroup> groupOpt = userGroupRepository.findById(id);
        if (groupOpt.isPresent()) {
            UserGroup existingGroup = groupOpt.get();
            existingGroup.setName(groupDetails.getName());  // Suponiendo que 'name' es un campo en UserGroup
            // Otros campos si existen
            userGroupRepository.save(existingGroup);
            return ResponseEntity.ok(existingGroup);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Eliminar un grupo
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGroup(@PathVariable Long id) {
        Optional<UserGroup> groupOpt = userGroupRepository.findById(id);
        if (groupOpt.isPresent()) {
            userGroupRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
