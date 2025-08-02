// src/main/java/com/sit/project1/controller/project1Controller.java
package com.sit.project1.controller;

import com.sit.project1.service.project1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class project1Controller {
    @Autowired
    private project1Service userService;

    @PostMapping
    public Map<String, String> registerUser(@RequestBody Map<String, String> userDetails) {
        return userService.registerUser(userDetails);
    }

    @GetMapping
    public List<Map<String, String>> getAllUsers() {
        return userService.getUsers();
    }

    @PutMapping("/{id}/email")
    public Map<String, String> updateEmail(@PathVariable Long id, @RequestBody Map<String, String> emailData) {
        String newEmail = emailData.get("email");
        return userService.updateEmail(id, newEmail);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id) ? "User deleted" : "User not found";
    }
}
