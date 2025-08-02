// src/main/java/com/sit/project1/service/project1Service.java
package com.sit.project1.service;

import org.springframework.stereotype.Service;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class project1Service {
    private final Map<Long, Map<String, String>> users = new HashMap<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    public Map<String, String> registerUser(Map<String, String> userDetails) {
        Long userId = idCounter.getAndIncrement();
        userDetails.put("id", String.valueOf(userId));
        users.put(userId, new HashMap<>(userDetails));
        return userDetails;
    }

    public List<Map<String, String>> getUsers() {
        return new ArrayList<>(users.values());
    }

    public Map<String, String> updateEmail(Long id, String newEmail) {
        Map<String, String> user = users.get(id);
        if (user != null) {
            user.put("email", newEmail);
            return user;
        }
        return null;
    }

    public boolean deleteUser(Long id) {
        return users.remove(id) != null;
    }
}
