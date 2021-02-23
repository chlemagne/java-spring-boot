package com.disco.javaspringboot.dao;

import com.disco.javaspringboot.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("UserInMemory")
public class UsersInMemory implements DataAccessObject<User> {

    private static List<User> USERS = new ArrayList<>();

    @Override
    public Optional<User> get(UUID id) {
        return getUserById(id);
    }

    @Override
    public List<User> getAll() {
        return USERS;
    }

    @Override
    public UUID create(User user) {
        USERS.add(user);
        return user.getId();
    }

    private Optional<User> getUserById(UUID id) {
        return USERS.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();
    }
}
