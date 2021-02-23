package com.disco.javaspringboot.service;

import com.disco.javaspringboot.dao.DataAccessObject;
import com.disco.javaspringboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private final DataAccessObject<User> dataAccess;

    @Autowired
    public UserService(@Qualifier("UserInMemory") DataAccessObject<User> dataAccess) {
        this.dataAccess = dataAccess;
    }

    public List<User> getAll() {
        return dataAccess.getAll();
    }

    public UUID create(User user) {
        return dataAccess.create(user);
    }
}
