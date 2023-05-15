package com.jekajops.fastcasinobot.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

@Service
public interface CrudService<T> {
    boolean create(T t);

    T softDelete(UUID uuid);

    T find(UUID uuid);

    List<T> findBy(Predicate<T> matcher);

    List<T> findAll();
}
