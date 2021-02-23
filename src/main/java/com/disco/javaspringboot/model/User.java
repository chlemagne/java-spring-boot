package com.disco.javaspringboot.model;

import java.util.UUID;

public class User {
    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String email;
    private final String password;

    public User(String firstName, String lastName, String middleName, String email, String password) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.email = email;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
