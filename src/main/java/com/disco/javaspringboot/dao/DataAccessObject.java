package com.disco.javaspringboot.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DataAccessObject<T> {

    Optional<T> get(UUID id);
    List<T> getAll();
    UUID create(T t);
}
